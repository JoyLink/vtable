package cs652.j.codegen.model;


import java.util.ArrayList;
import java.util.List;

public class ClassDef extends OutputModelObject{
    public String name;
    public ClassDef(String name){
        this.name = name;
    }
    @ModelElement public List<VarDef> fields = new ArrayList<>();
    @ModelElement public List<MethodDef> methods = new ArrayList<>();
    public List<Vtable> vtable = new ArrayList<>();

}
