package MinorPackage;
public class VirtualMachine2 extends TaskSolution1{
	int VM2Capacity;
	VirtualMachine2()
	{
		VM2Capacity=600;
	}
	public void eval(int taskNum,int parameter){
        System.out.println("Workload is being calculated at VIRTUAL MACHINE 2");
        evalValue(taskNum,parameter);
    }
	public void eval(int taskNum,float parameter){
        System.out.println("Workload is being calculated at VIRTUAL MACHINE 2");
        evalValue(taskNum,parameter);
    }

}