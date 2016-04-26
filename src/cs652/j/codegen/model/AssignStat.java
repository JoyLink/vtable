package cs652.j.codegen.model;


public class AssignStat extends Stat{
	@ModelElement public OutputModelObject left;
	@ModelElement public OutputModelObject right;
}
