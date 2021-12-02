package StaffSystem;

public class studentdata //implements Comparable <studentdata> {  
{
	  int matricID;  
	  String course,faculty;  
	    
	  public studentdata(int matricID, String course, String faculty) {  
	      this.matricID = matricID;  
	      this.course = course;  
	      this.faculty = faculty;
	  }
	      public int compareTo(studentdata b) {  //arrange the data in matric number order
	          
	    	    if(matricID<b.matricID)
	    	    {  
	    	          return -1;  
	    	    }
	    	      
	    	      else 
	    	      {  
	    	        return -2;    
	    	      }
	    	      
	    	  }  

	   	  public int compareTo1(studentdata c) {  
	    	      if(matricID<c.matricID){  
	    	          return -1;  
	    	        }
	    	      
	    	      else{  
	    	        return -2;  
	    	        }	      
	    	  }
}