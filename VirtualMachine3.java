package MinorPackage;
public class VirtualMachine3 extends TaskSolution2{

		int VM3Capacity;
		VirtualMachine3()
		{
			VM3Capacity=500;
		}
		public void eval(int taskNum,int parameter){
	        System.out.println("Workload is being calculated at VIRTUAL MACHINE 3");
	        evalValue(taskNum,parameter);
	    }
		public void eval(int taskNum,float parameter){
	        System.out.println("Workload is being calculated at VIRTUAL MACHINE 3");
	        evalValue(taskNum,parameter);
	    }
		

}

