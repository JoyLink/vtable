package cs652.j.semantics;

import cs652.j.parser.JBaseListener;
import cs652.j.parser.JParser;
import org.antlr.symbols.*;
import org.antlr.v4.runtime.misc.NotNull;

public class SetScopes extends JBaseListener {
	public Scope currentScope;
    public static final Type JINT_TYPE = new JPrimitiveType("int");
    public static final Type JFLOAT_TYPE = new JPrimitiveType("float");
    public static final Type JSTRING_TYPE = new JPrimitiveType("string");
    public static final Type JVOID_TYPE = new JPrimitiveType("void");

    private void pushScope(Scope s) {
        currentScope = s;
        System.out.println("entering: "+currentScope.getScopeName()+":"+s);
    }

    private void popScope() {
        System.out.println("leaving: "+currentScope.getScopeName()+":"+currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    @Override
    public void enterFile(@NotNull JParser.FileContext ctx) {
        pushScope(ctx.scope);
    }

    @Override
    public void exitFile(@NotNull JParser.FileContext ctx) {
        popScope();
    }

    @Override
    public void enterClassDeclaration(@NotNull JParser.ClassDeclarationContext ctx) {
        pushScope(ctx.scope);
    }

    @Override
    public void exitClassDeclaration(@NotNull JParser.ClassDeclarationContext ctx) {
        popScope();
    }

    @Override
    public void enterMethodDeclaration(@NotNull JParser.MethodDeclarationContext ctx) {
        pushScope(ctx.scope);
    }

    @Override
    public void exitMethodDeclaration(@NotNull JParser.MethodDeclarationContext ctx) {
        popScope();
    }

    @Override
    public void enterBlock(@NotNull JParser.BlockContext ctx) {
        pushScope(ctx.scope);
    }

    @Override
    public void exitBlock(@NotNull JParser.BlockContext ctx) {
        popScope();
    }
}
