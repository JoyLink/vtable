package cs652.j.codegen.model;


import java.util.ArrayList;
import java.util.List;

public class MethodDef extends OutputModelObject{
    @ModelElement public FuncName funcName;
    @ModelElement public TypeSpec returnType;
    @ModelElement public List<ArgDef> args = new ArrayList<>();
    @ModelElement public Block body = new Block();
    public String className;
}
