package MinorPackage;
public class VirtualMachine4 extends TaskSolution2{

		int VM4Capacity;
		VirtualMachine4()
		{
			VM4Capacity=800;
		}
		public void eval(int taskNum,int parameter){
	        System.out.println("Workload is being calculated at VIRTUAL MACHINE 4");
	        evalValue(taskNum,parameter);
	    }
		public void eval(int taskNum,float parameter){
	        System.out.println("Workload is being calculated at VIRTUAL MACHINE 4");
	        evalValue(taskNum,parameter);
	    }
		

}