package MinorPackage;
public class VirtualMachine1 extends TaskSolution1{

		int VM1Capacity;
		VirtualMachine1()
		{
			VM1Capacity=700;
		}
		public void eval(int taskNum,int parameter){
	        System.out.println("Workload is being calculated at VIRTUAL MACHINE 1");
	        evalValue(taskNum,parameter);
	    }
		public void eval(int taskNum,float parameter){
	        System.out.println("Workload is being calculated at VIRTUAL MACHINE 1");
	        evalValue(taskNum,parameter);
	    }
		

}