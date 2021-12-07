package MinorPackage;
import java.util.*;  
import java.lang.*;
public class DriverClass  {

    static void display(int n, int m)
	{
		int i, j;
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= m; j++)
			{
                if (i==1 || i==n || j==1 || (j==m && i!=4 && i!=5))             
                System.out.print("@");	
                else if (i==4 && j==(m-32))
                System.out.print("@");	   
                else if (i==5 && j==(m-26))
                System.out.print("@");                     
                else if (i==4 && j==57)
                System.out.print("Load Balancing in cloud computing");
                else if (i==5 && j==57)
                System.out.print("Mechanism of load balancing");
                else
                System.out.print(" "); 
	
			}
			System.out.println();
		}
	
	}
    

    public static void main(String args[]) {

        int rows = 9, columns = 135; 
        System.out.println("\t\t\t\t\t\t            MINOR 1 ");
        System.out.println(); 
       display(rows, columns); 
        System.out.println(); 
        System.out.println("\t\t\t\t\t\t\t           Approved by: ");
        System.out.println();
        System.out.println(" Mr. Amar Shukla  \t\t\t\t\t\t                                                Mr. Christalin Nelson S" );
        System.out.println("       [MENTOR]  \t\t\t\t\t\t\t\t                                    [PANEL MEMBER]" );
        System.out.println("\t\t\t\t\t\t\t           Submitted by: ");
        System.out.println();
        System.out.println("Ishika Mahawar [060]                     Sarthak Goyal [122] \t\t       Shreya Aggarwal [133]             \tVikas Mishra[149]" );
        System.out.println();
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of users:");
        int n=sc.nextInt();
        System.out.println("The number of users are: "+n);
      
        ArrayList<Integer> taskarr = new ArrayList<Integer>();
        for(int i =0;i<n;i++)
        {
       	 System.out.println("Enter task number " +(i+1)+" to be performed:");
        
       	 taskarr.add(sc.nextInt());
        }
        System.out.println("ArrayList of users : " + taskarr);

        ArrayList<Integer> prnarr = new ArrayList<Integer>();

		
        ArrayList<Integer> ranarr = new ArrayList<Integer>();

		
        ArrayList<Integer> dclb1arr = new ArrayList<Integer>();
        ArrayList<Integer> dclb2arr = new ArrayList<Integer>();

        List<Integer> parameter1=new ArrayList<Integer>();
        List<Float> parameter2=new ArrayList<Float>();
        List<Integer> parameter3=new ArrayList<Integer>();
        List<Float> parameter4=new ArrayList<Float>();
        List<Integer> sequenceList=new ArrayList<Integer>();
        List<Integer> sequenceList1=new ArrayList<Integer>();
 
        PriorityBasedRoundRobin obj=new PriorityBasedRoundRobin(n,taskarr);
        ranarr =obj.randomFunc();
       prnarr =obj.bubbleSort(ranarr,taskarr);
       System.out.println("\n");
       dclb1arr=(ArrayList<Integer>) obj.dcLoadbalancer1(prnarr);
       dclb2arr=(ArrayList<Integer>) obj.dcLoadbalancer2(prnarr);
       int d =dclb1arr.size();
       int e =dclb2arr.size();
      System.out.println("\n");
      System.out.println("Enter the choice: \n1 for integer value input\n2 for float value input "); 
     
      System.out.println("Total number of users directed to Data Centre 1 LoadBalancer ----> "+d);
      for(int i=0;i<d;i++)
      {
    	  System.out.println("Enter the task which the user "+dclb1arr.get(i)+"  has to perform");
    	  System.out.println("Please enter your choice(1 or 2):");
    	  int choice=sc.nextInt();
    	  if (choice==1)
    	  {
    		  System.out.println("Enter an integer value");
              parameter1.add(sc.nextInt());
              sequenceList.add(choice);
              
    	  }
    	  else if(choice==2)
    	  {
    		  System.out.println("Enter a float value");
              parameter2.add(sc.nextFloat());
              sequenceList.add(choice);

    	  }
    	  else {
    		  System.out.println("wrong choice");
    		  try {
    	            Thread.sleep(2000);
    	        } catch (InterruptedException e1) {
    	            
    	            e1.printStackTrace();
    	        }  
    	        System.out.flush(); 
    	  }
      }
      System.out.println("Enter the choice: \n1 for integer value input\n2 for float value input "); 
      
      System.out.println("Total number of users directed to Data Centre 2 LoadBalancer ----> "+d);
      for(int i=0;i<d;i++)
      {
    	  System.out.println("Enter the task which the user "+dclb2arr.get(i)+"  has to perform");
    	  System.out.println("Please enter your choice(1 or 2):");
    	  int choice1=sc.nextInt();
    	  if (choice1==1)
    	  {
    		  System.out.println("Enter an integer value");
              parameter3.add(sc.nextInt());
              sequenceList1.add(choice1);
              
    	  }
    	  else if(choice1==2)
    	  {
    		  System.out.println("Enter a float value");
              parameter4.add(sc.nextFloat());
              sequenceList1.add(choice1);

    	  }
    	  else {
    		  System.out.println("wrong choice");
    		  try {
    	            Thread.sleep(2000);
    	        } catch (InterruptedException e1) {
    	            
    	            e1.printStackTrace();
    	        }  
    	        System.out.flush(); 
    	  }
      }
      DC1LoadBalancer obj1=new DC1LoadBalancer(d,parameter1,parameter2,sequenceList );
      obj1.least_workload1();
      DC2LoadBalancer obj2=new DC2LoadBalancer(e,parameter3,parameter4,sequenceList1 );
      obj2.least_workload2();
    }
 
}
