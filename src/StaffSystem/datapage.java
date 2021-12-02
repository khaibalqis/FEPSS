package StaffSystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class datapage {
	  
		public void hello(){  
		    Queue<studentdata> ISA=new PriorityQueue<studentdata>();  
		    //Creating student data 
		    studentdata b1=new studentdata(100112,"ISA","FST");  
		    studentdata b2=new studentdata(100133,"ISA","FST");  
		    studentdata b3=new studentdata(100111,"ISA","FST");  
		    
		    //Adding students to the queue  
		    ISA.add(b1);  
		    ISA.add(b2);  
		    ISA.add(b3);  
		    
		    System.out.println("List Students inorder arrangement:\n");  
		    //Traversing queue elements  
		    for(studentdata b:ISA){  
		    System.out.println(b.matricID+" "+b.course+" "+b.faculty+" ");  
		    }  
		   
		 //    ISA.remove();  
		 //   System.out.println("After removing one student record:");  
		 //   for( requirementstudentdata b:ISA){  
		 //       System.out.println(b.matricID+" "+b.course+" "+b.faculty+" ");  
		 //       }  
		    
		    Queue<studentdata> EE=new PriorityQueue<studentdata>();  
		    //Creating student data 
		    studentdata c1=new studentdata(100233,"EE","FKAB");  
		    studentdata c2=new studentdata(100262,"EE","FKAB");  
		    studentdata c3=new studentdata(100213,"EE","FKAB");  
		    
		    //Adding Student data to the queue  
		    EE.add(c1);  
		    EE.add(c2);  
		    EE.add(c3);  
		    
		    System.out.println("List Students inorder arrangement:");  
		    //Traversing queue elements  
		    for(studentdata c:EE){  
		    System.out.println(c.matricID+" "+c.course+" "+c.faculty+" ");  
		    } 
		   
		    // EE.remove();  
		  //  System.out.println("After removing one student record:");  
		  //  for( requirementstudentdata c:EE){  
		  //      System.out.println(c.matricID+" "+c.course+" "+c.faculty+" ");  
		    //    }  
		    
		  
		}}



