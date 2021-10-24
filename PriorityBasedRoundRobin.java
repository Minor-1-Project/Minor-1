package MinorPackage;
import java.util.*;
public class PriorityBasedRoundRobin  
{
int n=0;
ArrayList<Integer> taskarr = new ArrayList<Integer>();
PriorityBasedRoundRobin()
{
	
}
PriorityBasedRoundRobin(int b,ArrayList<Integer> taskarr1)
{
	n=b;	
	taskarr=taskarr1;
}		
ArrayList<Integer> dcLoadbalancer1(ArrayList<Integer> al) {	
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
         System.out.println("\u001dIMPLEMENTING PRIORITY BASED ROUND ROBIN ALGORITHM");
    	 System.out.println("There are two data centre load balancers");  	 
         for(int i=0;i<n;i++)
    	 {
    		if(i%2==0)
    		{
    			list1.add(al.get(i));
    		}
    	 }
         return list1;
	}
	ArrayList<Integer> dcLoadbalancer2(ArrayList<Integer> arrayList) {
		ArrayList<Integer> list2=new ArrayList<Integer>(n);
		System.out.println();
        System.out.println("Implementing priority Round Robin Algorithm");
   	 System.out.println("There are two data centre load balancers");   	 
        for(int i=0;i<n;i++)
   	 {
   		if(i%2!=0)
   		{
			list2.add(arrayList.get(i));  			
   	 } 
	}
		return list2;
		}
	ArrayList<Integer> randomFunc() {
		ArrayList<Integer> ranarr = new ArrayList<Integer>(n);
		int minran = 1;
        int maxran = 10;
	 for(int i=0;i<n;i++)
     {
    	 ranarr.add((int)Math.floor(Math.random()*(maxran-minran+1)+minran));
     }
     System.out.println();
     System.out.println("ArrayList of random priorities: " + ranarr);
     return ranarr;
	}
	ArrayList<Integer> bubbleSort (ArrayList<Integer> arr1, ArrayList<Integer> arr2)
	{      
       // System.out.println("Random array: "+arr1);
        System.out.println("User array: "+arr2);

        for(int i=0;i<arr1.size()-1;i++){
            for(int j=0;j<arr1.size()-i-1;j++){
                if(arr1.get(j)>arr1.get(j+1)){
                    int temp = arr1.get(j+1);
                    arr1.set(j+1,arr1.get(j));
                    arr1.set(j,temp);
                    int temp2 = arr2.get(j+1);
                    arr2.set(j+1,arr2.get(j));
                    arr2.set(j,temp2);
                }
            }
        }            
        System.out.println("Sorted random array: "+arr1);
        System.out.println("Corresponding User array: "+arr2);
        return arr2;   
    }
}