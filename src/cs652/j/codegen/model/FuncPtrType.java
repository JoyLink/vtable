package cs652.j.codegen.model;


import java.util.ArrayList;
import java.util.List;

public class FuncPtrType extends OutputModelObject {
      @ModelElement public TypeSpec returnType;
      @ModelElement public List<TypeSpec> argTypes = new ArrayList<>();
      //function belongs to which class
      public String className;
}
