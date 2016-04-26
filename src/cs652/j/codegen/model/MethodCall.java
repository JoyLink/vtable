package cs652.j.codegen.model;


import java.util.ArrayList;
import java.util.List;

public class MethodCall extends Expr{
    @ModelElement public Expr receiver;
    @ModelElement public FuncName receiverType;
    @ModelElement public FuncPtrType fptrType;
    @ModelElement public List<OutputModelObject> args = new ArrayList<>();
    public String methodName;
    public String className;
}
