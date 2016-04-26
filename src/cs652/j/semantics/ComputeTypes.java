package cs652.j.semantics;

import cs652.j.parser.JParser;
import org.antlr.symbols.*;
import org.antlr.v4.runtime.misc.NotNull;

public class ComputeTypes extends SetScopes {
    public static final Type JINT_TYPE = new JPrimitiveType("int");
    public static final Type JFLOAT_TYPE = new JPrimitiveType("float");
    public static final Type JSTRING_TYPE = new JPrimitiveType("string");
    public static final Type JVOID_TYPE = new JPrimitiveType("void");

    public ComputeTypes(GlobalScope globals) {
        this.currentScope = globals;
    }

    @Override
    public void exitMethodExpr(@NotNull JParser.MethodExprContext ctx) {
        ctx.t =ctx.expression().t;
    }

    @Override
    public void exitDotExpr(@NotNull JParser.DotExprContext ctx) {
        JClass jClass=(JClass)ctx.expression().t;
        TypedSymbol typedSymbol= (TypedSymbol) jClass.resolve(ctx.Identifier().getText());
        ctx.t = typedSymbol.getType();
    }

    @Override
    public void exitNewExpr(@NotNull JParser.NewExprContext ctx) {
        ctx.t = (Type) currentScope.resolve(ctx.Identifier().getText());
    }

    @Override
    public void exitLiteralExpr(@NotNull JParser.LiteralExprContext ctx) {
        if(ctx.literal().getText().equals("null"))  ctx.t = JVOID_TYPE;
        else if(ctx.literal().IntegerLiteral()!=null) ctx.t = JINT_TYPE;
        else if(ctx.literal().FloatingPointLiteral()!=null) ctx.t = JFLOAT_TYPE;
        else if(ctx.literal().StringLiteral()!=null)  ctx.t =JSTRING_TYPE;
    }
    @Override
    public void exitThisExpr(@NotNull JParser.ThisExprContext ctx) {
        Scope scope = currentScope;
        while(!(scope instanceof JClass))scope = scope.getEnclosingScope();
        ctx.t = (Type) scope.resolve(((JClass) scope).getName());
    }

    @Override
    public void exitVarRefExpr(@NotNull JParser.VarRefExprContext ctx) {
        TypedSymbol typedSymbol = (TypedSymbol) currentScope.resolve(ctx.Identifier().getText());
        if(ctx.Identifier().getText().equals("printf")) ctx.t = JVOID_TYPE;
        else ctx.t = typedSymbol.getType();
    }

    @Override
    public void exitMain(@NotNull JParser.MainContext ctx) {
        ctx.t = JVOID_TYPE;
    }
}

