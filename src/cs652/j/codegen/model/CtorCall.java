package cs652.j.codegen.model;


public class CtorCall extends Expr{
    public String name;
    public CtorCall(String name){
        this.name = name;
    }
}
