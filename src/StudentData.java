
import java.util.PriorityQueue;
import java.util.Queue;


  public class StudentData {
    	
    	private int course;
    	private int faculty;
		public int matricID;

    	public StudentData(int i, String string, String string2) {
    		// TODO Auto-generated constructor stub
    	}

    	public void main(String[] args) {  
    	    Queue<StudentData> ISA=new PriorityQueue<StudentData>();  
    	    //Creating student data 
    	    StudentData b1=new StudentData(100001,"ISA","FST");  
    	    StudentData b2=new StudentData(100102,"ISA","FST");  
    	    StudentData b3=new StudentData(100033,"ISA","FST");  
    	    
    	    //Adding Books to the queue  
    	    ISA.add(b1);  
    	    ISA.add(b2);  
    	    ISA.add(b3);  
    	    
    	    System.out.println("Traversing the queue elements:");  
    	    //Traversing queue elements  
    	    for(StudentData b:ISA){  
    	    System.out.println(b.matricID+" "+b.course+" "+b.faculty+" ");  
    	    }  
    	    
    	    //   ISA.remove();  
    	    //   System.out.println("After removing one student record:");  
    	    //   for( requirementstudentdata b:ISA){  
    	    //       System.out.println(b.matricID+" "+b.course+" "+b.faculty+" ");  
    	    //       }  
    	       
    	       Queue<StudentData> EE=new PriorityQueue<StudentData>();  
    	       //Creating student data 
    	       StudentData c1=new StudentData(100233,"EE","FKAB");  
    	       StudentData c2=new StudentData(100262,"EE","FKAB");  
    	       StudentData c3=new StudentData(100213,"EE","FKAB");  
    	       
    	       //Adding Student data to the queue  
    	       EE.add(c1);  
    	       EE.add(c2);  
    	       EE.add(c3);  
    	       
    	       System.out.println("Traversing the queue elements:");  
    	       //Traversing queue elements  
    	       for(StudentData c:EE){  
    	       System.out.println(c.matricID+" "+c.course+" "+c.faculty+" ");  
    	       } 
    	      
    	       // EE.remove();  
    	     //  System.out.println("After removing one student record:");  
    	     //  for( requirementstudentdata c:EE){  
    	     //      System.out.println(c.matricID+" "+c.course+" "+c.faculty+" ");  
    	       //    }  
    	       
    	     
    	   }}

//public static void doSomething() {
	// TODO Auto-generated method stub
	
//}



    


