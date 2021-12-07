package MinorPackage;
public class TaskSolution2 {
    int Task3Cap, Task4Cap;
    TaskSolution2(){
        Task3Cap=200;
        Task4Cap=300;
    }

    public void evalTask3(int parameter){
    	int i,fact=1;  
    	 for(i=1;i<=parameter;i++){    
    	      fact=fact*i;    
    	  }    
    	 System.out.println("Printing Factorial of "+parameter);
    }
    public void evalTask4(float parameter){
    	System.out.println();
    	int num=(int)parameter;
    	double decimal=parameter-num;
        System.out.println("Integer part is:"+num);
        System.out.println("Decimal part is:"+decimal);
        System.out.println("Product is:"+(num*decimal));
    }

   
    //----------------------------------------------------///
    
    public void evalValue(int taskNum, int parameter){
        
            evalTask3(parameter);
       
    }

    public void evalValue(int taskNum, float parameter){
        
        evalTask4(parameter);
   
    }

    
}