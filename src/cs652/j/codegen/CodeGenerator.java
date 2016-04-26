package cs652.j.codegen;

import cs652.j.codegen.model.*;
import cs652.j.parser.JBaseVisitor;
import cs652.j.parser.JParser;
import cs652.j.semantics.JClass;
import cs652.j.semantics.JMethod;
import org.antlr.symbols.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.List;
import java.util.Set;

public class CodeGenerator extends JBaseVisitor<OutputModelObject> {
      public STGroup templates;
      public String fileName;

      public Scope currentScope;
      public JClass currentClass;


      public CodeGenerator(String fileName) {
            this.fileName = fileName;
            templates = new STGroupFile("resources/cs652/j/templates/C.stg");
      }

      public CFile generate(ParserRuleContext tree) {
            CFile file = (CFile) visit(tree);
            return file;
      }

      @Override
      public OutputModelObject visitFile(@NotNull JParser.FileContext ctx) {
            currentScope = ctx.scope;
            CFile cFile = new CFile(ctx.getText());
            List<JParser.ClassDeclarationContext> list = ctx.classDeclaration();
            for (JParser.ClassDeclarationContext classDeclarationContext : list)  cFile.classes.add((ClassDef) visitClassDeclaration(classDeclarationContext));
            cFile.main = (MainMethod) visit(ctx.main());
            return cFile;
      }

      @Override
      public OutputModelObject visitMain(@NotNull JParser.MainContext ctx) {
            MainMethod main = new MainMethod();
            int length = ctx.blockStatement().size();
            for (int i = 0; i < length; i++) {
                  if (ctx.blockStatement().get(i).localVariableDeclarationStatement() != null)  main.body.locals.add((VarDef) visitLocalVariableDeclarationStatement(ctx.blockStatement().get(i).localVariableDeclarationStatement()));
                  else if (ctx.blockStatement().get(i).statement() != null)  main.body.instrs.add((Stat) visit(ctx.blockStatement().get(i).statement()));
            }
            return main;
      }

      @Override
      public OutputModelObject visitMethodBody(@NotNull JParser.MethodBodyContext ctx) {
            MethodDef methodDef = new MethodDef();
            List<JParser.BlockStatementContext> list = ctx.blockStatement();
            for (JParser.BlockStatementContext blockStatementContext : list) {
                  if (blockStatementContext.localVariableDeclarationStatement() != null)  methodDef.body.locals.add((VarDef) visitLocalVariableDeclarationStatement(blockStatementContext.localVariableDeclarationStatement()));
                  if (blockStatementContext.statement() != null)  methodDef.body.instrs.add((Stat) visit(blockStatementContext.statement()));
            }
            return methodDef;
      }

      @Override
      public OutputModelObject visitLocalVariableDeclarationStatement(@NotNull JParser.LocalVariableDeclarationStatementContext ctx) {
            VarDef varDef = new VarDef(ctx.localVariableDeclaration().variableDeclarators().variableDeclarator().variableDeclaratorId().Identifier().getText());
            varDef.type = (TypeSpec) visit(ctx.localVariableDeclaration().type());
            return varDef;
      }

      @Override
      public OutputModelObject visitThisExpr(@NotNull JParser.ThisExprContext ctx) {
            return new ThisRef();
      }

      @Override
      public OutputModelObject visitClassDeclaration(@NotNull JParser.ClassDeclarationContext ctx) {
            currentScope = ctx.scope;
            currentClass = (JClass) ctx.scope;
            ClassDef classDef = (ClassDef) visit(ctx.classBody());
            currentScope = currentScope.getEnclosingScope();
            return classDef;
      }

      @Override
      public OutputModelObject visitClassBody(@NotNull JParser.ClassBodyContext ctx) {
            ClassDef classDef = new ClassDef(currentClass.getName());
            for (int i = 0; i < ctx.classBodyDeclaration().size(); i++) {
                  if (ctx.classBodyDeclaration(i).memberDeclaration().methodDeclaration() != null) classDef.methods.add((MethodDef) visit(ctx.classBodyDeclaration(i).memberDeclaration().methodDeclaration()));
            }
            Set<MethodSymbol> method = currentClass.getVisibleMethods();
            for (MethodSymbol methodSymbol : method) classDef.vtable.add(null);
            for (MethodSymbol methodSymbol : method) {
                  Vtable vtable = new Vtable(methodSymbol.getName());
                  vtable.className = methodSymbol.getEnclosingScope().getScopeName();
                  classDef.vtable.set(methodSymbol.getSlotNumber(), vtable);
            }
            Set<FieldSymbol> fields = currentClass.getVisibleFields();
            for (FieldSymbol fieldSymbol : fields) {
                  VarDef varDef = new VarDef(fieldSymbol.getName());
                  varDef.type = getTypeSpec(fieldSymbol.getType());
                  classDef.fields.add(varDef);
            }
            return classDef;
      }

      @Override
      public OutputModelObject visitLocalVariableDeclaration(@NotNull JParser.LocalVariableDeclarationContext ctx) {
            VarDef varDef = new VarDef(ctx.variableDeclarators().variableDeclarator().variableDeclaratorId().Identifier().getText());
            varDef.type = (TypeSpec) visitType(ctx.type());
            return varDef;
      }

      @Override
      public OutputModelObject visitIfStat(@NotNull JParser.IfStatContext ctx) {
            IfStat ifStat = new IfStat();
            ifStat.condition = (Expr) visit(ctx.parExpression().expression());
            ifStat.stat = (Stat) visit(ctx.statement());
            return ifStat;
      }

      @Override
      public OutputModelObject visitElseStat(@NotNull JParser.ElseStatContext ctx) {
            ElseStat elseStat = new ElseStat();
            elseStat.elseStat = (Stat) visit(ctx.statement());
            return elseStat;
      }

      @Override
      public OutputModelObject visitReturnStat(@NotNull JParser.ReturnStatContext ctx) {
            ReturnStat returnStat = new ReturnStat();
            returnStat.expr = visit(ctx.expression());
            return returnStat;
      }

      @Override
      public OutputModelObject visitBlock(@NotNull JParser.BlockContext ctx) {
            Blocks blocks = new Blocks();
            for (int i = 0; i < ctx.blockStatement().size(); i++)  blocks.blockList.add((Block) visit(ctx.blockStatement(i)));
            return blocks;
      }

      @Override
      public OutputModelObject visitWhileStat(@NotNull JParser.WhileStatContext ctx) {
            WhileStat whileStat = new WhileStat();
            whileStat.condition = (Expr) visit(ctx.parExpression().expression());
            whileStat.stat = visit(ctx.statement());
            return whileStat;
      }

      @Override
      public OutputModelObject visitBlockStat(@NotNull JParser.BlockStatContext ctx) {
            currentScope = ctx.block().scope;
            currentScope = currentScope.getEnclosingScope();
            return visit(ctx.block());
      }

      @Override
      public OutputModelObject visitExpr(@NotNull JParser.ExprContext ctx) {
            CallStat callStat = new CallStat();
            callStat.call = visit(ctx.expression());
            return callStat;
      }

      @Override
      public OutputModelObject visitBlockStatement(@NotNull JParser.BlockStatementContext ctx) {
            Block block = new Block();
            if (ctx.localVariableDeclarationStatement() != null) block.locals.add((VarDef) visitLocalVariableDeclaration(ctx.localVariableDeclarationStatement().localVariableDeclaration()));
             else if (ctx.statement() != null) block.instrs.add((Stat) visit(ctx.statement()));
            return block;
      }


      @Override
      public OutputModelObject visitNewExpr(@NotNull JParser.NewExprContext ctx) {
            return  new CtorCall(ctx.Identifier().getText());
      }

      @Override
      public OutputModelObject visitVarRefExpr(@NotNull JParser.VarRefExprContext ctx) {
            if (currentScope.getSymbol(ctx.Identifier().getText()) != null)   return new VarRef(ctx.Identifier().getText());
            else {
                  FieldRef fieldRef = new FieldRef();
                  fieldRef.object = new ThisRef();
                  fieldRef.name = ctx.Identifier().getText();
                  return fieldRef;
            }
      }

      @Override
      public OutputModelObject visitLiteralExpr(@NotNull JParser.LiteralExprContext ctx) {
            LiteralRef literalRef = new LiteralRef();
            if (ctx.literal().FloatingPointLiteral() != null) literalRef.content = ctx.literal().FloatingPointLiteral().getText();
            else if (ctx.literal().StringLiteral() != null)  literalRef.content = ctx.literal().StringLiteral().getText();
            else if (ctx.literal().IntegerLiteral() != null)  literalRef.content = ctx.literal().IntegerLiteral().getText();
            else if (ctx.literal().getText().equals("null"))  return  new NullRef();
            return literalRef;
      }

      @Override
      public OutputModelObject visitAssignStat(@NotNull JParser.AssignStatContext ctx) {
            AssignStat assignStat = new AssignStat();
            assignStat.left = visit(ctx.left);
            assignStat.right = visit(ctx.right);
            if (ctx.left.t instanceof JClass) assignStat.right = ctx.left.t == ctx.right.t ? assignStat.right : new TypeCast(assignStat.right, getTypeSpec(ctx.left.t));
            return assignStat;
      }

      private TypeSpec getTypeSpec(Type t) {
            if (t instanceof PrimitiveType)   return t.getName().equals("void") ? new ObjectTypeSpec(currentClass.getName()) : new PrimitiveTypeSpec(t.getName());
            else  return  new ObjectTypeSpec(t.getName());
      }

      @Override
      public OutputModelObject visitDotExpr(@NotNull JParser.DotExprContext ctx) {
            FieldRef fieldRef = new FieldRef();
            fieldRef.name = ctx.Identifier().getText();
            fieldRef.object = (Expr) visit(ctx.expression());
            return fieldRef;
      }

      @Override
      public OutputModelObject visitPrimitiveType(@NotNull JParser.PrimitiveTypeContext ctx) {
            return new PrimitiveTypeSpec(ctx.getText());
      }

      @Override
      public OutputModelObject visitMethodDeclaration(@NotNull JParser.MethodDeclarationContext ctx) {
            currentScope = ctx.scope;
            currentClass = (JClass) currentScope.getEnclosingScope();
            MethodDef methodDef = (MethodDef) visitMethodBody(ctx.methodBody());
            FuncName funcName = new FuncName(ctx.Identifier().getText());
            methodDef.funcName = funcName;
            methodDef.className = currentClass.getName();
            if (ctx.formalParameters().formalParameterList() != null) {
                  for (int i = 0; i < ctx.formalParameters().formalParameterList().formalParameter().size(); i++) {
                        methodDef.args.add((ArgDef) visitFormalParameter(ctx.formalParameters().formalParameterList().formalParameter(i)));
                  }
            }
            methodDef.returnType =( (ctx.type() == null) ? new VoidType() : (PrimitiveTypeSpec) visitPrimitiveType(ctx.type().primitiveType()));
            currentScope = currentScope.getEnclosingScope();
            return methodDef;
      }

      @Override
      public OutputModelObject visitFormalParameter(@NotNull JParser.FormalParameterContext ctx) {
            ArgDef argDef = new ArgDef();
            argDef.type = (TypeSpec) visitType(ctx.type());
            argDef.name = ctx.variableDeclaratorId().Identifier().getText();
            return argDef;
      }

      @Override
      public OutputModelObject visitPrintStat(@NotNull JParser.PrintStatContext ctx) {
            List<JParser.ExpressionContext> list = ctx.expressionList().expression();
            if (list.size() == 1) {
                  PrintStringStat printStringStat = new PrintStringStat();
                  printStringStat.args.add(visit(list.get(0)));
                  return printStringStat;
            } else {
                  PrintStat printStat = new PrintStat();
                  for (JParser.ExpressionContext e : ctx.expressionList().expression()) printStat.args.add(visit(e));
                  return printStat;
            }
      }

      @Override
      public OutputModelObject visitType(@NotNull JParser.TypeContext ctx) {
            return ctx.primitiveType() == null ? new ObjectTypeSpec(ctx.getText()) : new PrimitiveTypeSpec(ctx.getText());
      }

      @Override
      public OutputModelObject visitMethodExpr(@NotNull JParser.MethodExprContext ctx) {
            MethodCall methodCall = new MethodCall();
            JMethod jMethod;
            FuncName funcName;
            FuncPtrType funcPtrType = new FuncPtrType();
            funcPtrType.returnType = ctx.t == null ? new VoidType() : new PrimitiveTypeSpec(ctx.t.getName());
            if (ctx.expression() instanceof JParser.DotExprContext) {
                  currentClass = (JClass) ((JParser.DotExprContext) ctx.expression()).expression().t;
                  jMethod = (JMethod) currentClass.resolveMethod(((JParser.DotExprContext) ctx.expression()).Identifier().getText());
                  funcName = new FuncName(((JParser.DotExprContext) ctx.expression()).expression().t.getName());
                  methodCall.receiver = (Expr) visit(((JParser.DotExprContext) ctx.expression()).expression());
            } else {
                  jMethod = (JMethod) currentClass.resolveMethod(ctx.expression().getText());
                  funcName = new FuncName(currentClass.getName());
                  methodCall.receiver = new ThisRef();
            }
            funcPtrType.className = jMethod.getEnclosingScope().getScopeName();
            methodCall.className = jMethod.getEnclosingScope().getScopeName();
            methodCall.fptrType = funcPtrType;
            if (ctx.expressionList() != null) {
                  for (JParser.ExpressionContext e : ctx.expressionList().expression()) {
                        methodCall.fptrType.argTypes.add(getTypeSpec(e.t));
                        methodCall.args.add(formatArg(e));
                  }
            }
            methodCall.receiverType = funcName;
            methodCall.methodName = jMethod.getName();
            return methodCall;
      }

      private OutputModelObject formatArg(JParser.ExpressionContext ctx) {
            if (ctx instanceof JParser.VarRefExprContext && ctx.t instanceof JClass)return new ObjectArg(ctx.getText(), getTypeSpec(ctx.t));
            else return visit(ctx);
      }

      @Override
      public OutputModelObject visitFieldDeclaration(@NotNull JParser.FieldDeclarationContext ctx) {
            VarDef varDef = new VarDef(ctx.variableDeclarators().variableDeclarator().variableDeclaratorId().Identifier().getText());
            varDef.type = (TypeSpec) visit(ctx.type());
            return varDef;
      }

}
