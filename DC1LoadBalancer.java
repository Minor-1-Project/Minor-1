package MinorPackage;
import java.util.*;
public class DC1LoadBalancer {
	
	List<Integer> task1parameter;
    List<Integer> task1parameterlw;
    List<Float> task2parameter;
    List<Float> task2parameterlw;
    List<Integer> sequence = new ArrayList<>(); 

    int n;
    
	VirtualMachine1 vm1=new VirtualMachine1();
	VirtualMachine2 vm2=new VirtualMachine2();
	
	DC1LoadBalancer(int d,List<Integer> task1,List<Float> task2,List<Integer> sequenceList){
	 n=d;
	 task1parameter=task1;
     task1parameterlw=new ArrayList<Integer>(task1parameter);
     task2parameter=task2;
     task2parameterlw=new ArrayList<Float>(task2parameter);
     sequence=sequenceList;
     
	
	}
	
	 public  void least_workload1() {
		 System.out.println();
	        System.out.println("IMPLEMENTING LEAST WORKLOAD SCHEDULING");
	        System.out.println();
	        ArrayList <Integer[]> maxvmcapacity= new ArrayList<>();
	        maxvmcapacity.add(new Integer[]{vm1.VM1Capacity,1});
	        maxvmcapacity.add(new Integer[]{vm2.VM2Capacity,2});
	        
	        for(int i=0;i<n;i++){
	            
	            for(int j=1;j<=2;j++){
	                if(j==1){
	                    maxvmcapacity.get(0)[0]=vm1.VM1Capacity;
	                    maxvmcapacity.get(0)[1]=j;
	                }
	                else if(j==2){
	                    maxvmcapacity.get(1)[0]=vm2.VM2Capacity;
	                    maxvmcapacity.get(1)[1]=j;
	                }
	            }

	            Collections.sort(maxvmcapacity, new Comparator<Integer[]>() {
	                            public int compare(Integer[] array1, Integer[] array2) {
	                                return array1[0].compareTo(array2[0]);
	                            }
	                        });
	            System.out.println();
	            System.out.println("\nCalculating the task of users at DataCentre 1 ");
	            if(sequence.get(i)==1){
	                System.out.println("Calculating task for choice: "+sequence.get(i));
	                int o=maxvmcapacity.get(1)[1];
	                if(vm1.Task1Cap<=maxvmcapacity.get(1)[0]){
	                    if(o==1){
	                        vm1.eval(1,task1parameterlw.get(0));
	                        task1parameterlw.remove(0);
	                        vm1.VM1Capacity=vm1.VM1Capacity-vm1.Task1Cap;
	                    }
	                    else if(o==2){
	                        vm2.eval(1,task1parameterlw.get(0));
	                        task1parameterlw.remove(0);
	                        vm2.VM2Capacity=vm2.VM2Capacity-vm2.Task2Cap;

	                    }
	                   
	                    
	                }
	                else{
	                    System.out.println("ERROR: The virtual machine"+o+"is overloaded.");
	                }
	            }
	            else if(sequence.get(i)==2){
	                System.out.println("Calculating task for choice : "+sequence.get(i));
	                int o=maxvmcapacity.get(1)[1];
	                if(vm1.Task2Cap<=maxvmcapacity.get(1)[0]){
	                    if(o==1){
	                        vm1.eval(2, task2parameterlw.get(0));
	                        task2parameterlw.remove(0);
	                        vm1.VM1Capacity=vm1.VM1Capacity-vm1.Task1Cap;
	                    }
	                    else if(o==2){
	                        vm2.eval(2, task2parameterlw.get(0));
	                        task2parameterlw.remove(0);
	                        vm2.VM2Capacity=vm2.VM2Capacity-vm2.Task2Cap;

	                    }                    
	                }
	                else{
	                    System.out.println("ERROR: The virtual machine\"+o+\"is overloaded." );
	                }
	            }
	        }}}