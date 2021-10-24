# Minor-1
****Design and Implementation of Load Balancing Algorithms in Cloud Computing ****

**PROBLEM:**
1.Heavy load on servers resulting in server breakdown:
2.Improper Resource Management:
3.Too much load on one load balancer:


**Introduction-**
We have devised a 2-tier load balancing architecture using load balancing algorithms to balance the load on the servers.This proposed architecture is a master-slave architecture in which the load balancer at the first level acts as a master and the load balancers at the  second level are the slaves.The master load balancer allocates task accordingly to the slave load balancers.Such an architecture can prevent performance issues as the load at slave level is pre-distributed by the master.To achieve proper resource management, we are using these load balancing algorithms-weighted round robin and least connection. These algorithms aid to achieve efficient task scheduling. Efficient task scheduling mechanisms can meet users' requirements, and improve the resource utilization, thereby enhancing the overall performance.



**Significant functions of the project**
 We will use the concept of dynamic provisioning in the project and will decide which resources are having  less number of requests to handle and will send the incoming requests to them only on the fly.The concept of scalability increases both at the load balancer level 2 and the servers in the data center. If by chance we have a problem with one of the slave load balancers then we have the load balancer to handle the request coming and till that time we can have another either troubleshoot the cause or create a new load balancer for use and if the have any servers not functioning properly then we can spin up another server and register it with the load balancerwhich would then be available to process the further requests coming from the slave load balancer.
 
 
 
**** SYSTEM REQUIREMENTS****

**Hardware Interface: **

Linux Operating System to be used (works with Virtualization also). 
Minimum RAM requirement for proper functioning is 4 GB. 
Required input as well as output devices. 

**Software Interface: **

This system is developed in the java programming language. 
java compiler (Eclipse IDE)

 
 
 



