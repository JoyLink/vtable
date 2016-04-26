package cs652.j.codegen.model;

import java.util.ArrayList;
import java.util.List;

public class Block extends Stat{
    @ModelElement public List<VarDef> locals = new ArrayList<>();
    @ModelElement public List<Stat> instrs = new ArrayList<>();
}
