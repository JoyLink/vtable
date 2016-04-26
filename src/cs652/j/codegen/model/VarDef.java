package cs652.j.codegen.model;

public class VarDef extends OutputModelObject{
    @ModelElement public TypeSpec type;
    public String name;
    public VarDef(String name)
    {
        this.name = name;
    }
}
