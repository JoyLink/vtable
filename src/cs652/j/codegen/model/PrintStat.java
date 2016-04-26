package cs652.j.codegen.model;


import java.util.ArrayList;
import java.util.List;

public class PrintStat extends Stat{
    @ModelElement public List<OutputModelObject> args = new ArrayList<>();

}
