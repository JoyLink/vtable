package cs652.j.semantics;

import cs652.j.parser.JBaseListener;
import cs652.j.parser.JParser;
import org.antlr.symbols.*;
import org.antlr.v4.runtime.misc.NotNull;


public class DefineScopesAndSymbols extends JBaseListener {
    public Scope currentScope;


    public DefineScopesAndSymbols(GlobalScope globals) {
        currentScope = globals;
        JPrimitiveType JINT_TYPE = new JPrimitiveType("int");
        JPrimitiveType JFLOAT_TYPE = new JPrimitiveType("float");
        JPrimitiveType JSTRING_TYPE = new JPrimitiveType("string");
        JPrimitiveType JVOID_TYPE = new JPrimitiveType("void");
        currentScope.define(JFLOAT_TYPE);
        currentScope.define(JINT_TYPE);
        currentScope.define(JSTRING_TYPE);
        currentScope.define(JVOID_TYPE);


    }

    @Override
    public void enterFile(@NotNull JParser.FileContext ctx) {
        ctx.scope = (GlobalScope) currentScope;
    }
    @Override
    public void exitFile(@NotNull JParser.FileContext ctx) {
        popScope();
    }

    @Override
    public void enterBlock(@NotNull JParser.BlockContext ctx) {
        LocalScope l = new LocalScope(currentScope);
        ctx.scope = l;
        pushScope(l);
    }

    @Override
    public void exitBlock(@NotNull JParser.BlockContext ctx) {
        popScope();
    }

    @Override
    public void enterFormalParameter(@NotNull JParser.FormalParameterContext ctx) {
        JVar arg = new JVar(currentScope,ctx.variableDeclaratorId().Identifier().getText());
        currentScope.define(arg);
        Type type;
        if(ctx.type().primitiveType() == null)
        {
            type = (Type)currentScope.resolve(ctx.type().classOrInterfaceType().getText());
        }
        else type = (Type)currentScope.resolve(ctx.type().primitiveType().getText());
        arg.setType(type);

    }

    @Override
    public void enterLocalVariableDeclaration(@NotNull JParser.LocalVariableDeclarationContext ctx) {
        JVar v = new JVar(currentScope, ctx.variableDeclarators().variableDeclarator().variableDeclaratorId().Identifier().getText());
        if(ctx.type().primitiveType()==null)
        {
            Type type = (Type)currentScope.resolve(ctx.type().classOrInterfaceType().getText());
            v.setType(type);
            currentScope.define(v);
        }
        else
        {
            Type type = (Type) currentScope.resolve(ctx.type().primitiveType().getText());
            v.setType(type);
            currentScope.define(v);
        }
    }

    @Override
    public void enterClassDeclaration(@NotNull JParser.ClassDeclarationContext ctx) {
        JClass c = new JClass(ctx.Identifier().getText(), ctx);
        c.setEnclosingScope(currentScope);
        if(ctx.type()!= null) c.setSuperClass(ctx.type().getText());
        currentScope.define(c);
        ctx.scope = c;
        pushScope(c);
    }
    @Override
    public void exitClassDeclaration(@NotNull JParser.ClassDeclarationContext ctx) {
        popScope();
    }
    @Override
    public void enterFieldDeclaration(@NotNull JParser.FieldDeclarationContext ctx){
        JField f = new JField(currentScope,ctx.variableDeclarators().variableDeclarator().variableDeclaratorId().Identifier().getText());
        Type type = (Type)currentScope.resolve(ctx.type().getText());
        f.setType(type);
        currentScope.define(f);
    }

    @Override
    public void enterMethodDeclaration(@NotNull JParser.MethodDeclarationContext ctx){
        JMethod m = new JMethod(ctx.Identifier().getText(),ctx);
        m.setEnclosingScope(currentScope);
        Type type;
        if(ctx.type() == null)
        {
            type = (Type) currentScope.resolve("void");
        }
        else type=(Type)currentScope.resolve(ctx.type().getText());
        m.setType(type);
        currentScope.define(m);
        ctx.scope = m;
        pushScope(m);
    }
    @Override
    public void exitMethodDeclaration(@NotNull JParser.MethodDeclarationContext ctx){
        popScope();
    }
    private void pushScope(Scope s) {
        currentScope = s;

    }

    private void popScope() {
        currentScope = currentScope.getEnclosingScope();
    }
}
