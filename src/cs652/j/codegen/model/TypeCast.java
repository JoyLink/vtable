package cs652.j.codegen.model;


public class TypeCast extends Expr{
    @ModelElement public TypeSpec type;
    @ModelElement public OutputModelObject expr;

    public TypeCast(OutputModelObject right, TypeSpec typeSpec) {
        this.type = typeSpec;
        this.expr = right;

    }
}
