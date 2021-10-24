package MinorPackage;
public class TaskSolution1 {
    int Task1Cap, Task2Cap;
    TaskSolution1(){
        Task1Cap=200;
        Task2Cap=300;
    }

    public void evalTask1(int parameter){
    	System.out.println();
    	System.out.println("Printing Fibonacci Series upto "+parameter+" values:");
    	int n1=0,n2=1,n3,i;    
    	 System.out.print(n1+" "+n2);
    	 for(i=2;i<parameter;++i)
    	 {    
    	  n3=n1+n2;    
    	  System.out.print(" "+n3);    
    	  n1=n2;    
    	  n2=n3;    
    	 }   
    }
    public void evalTask2(Float parameter){
    	System.out.println();
        System.out.println("Printing Binary Equivalence for the float value");
    	System.out.println(Integer.toBinaryString(Float.floatToIntBits(parameter)));
        
    }

   
    //----------------------------------------------------///
    
    public void evalValue(int taskNum, int parameter){
        
            evalTask1(parameter);
       
    }

    public void evalValue(int taskNum, float parameter){
        
        evalTask2(parameter);
   
    }

    
}