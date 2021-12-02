package StaffSystem;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.NoSuchElementException;


 public class AddNDelPaper {


	public void edit() {

		LinkedBlockingQueue<String> AddNDelPape = new LinkedBlockingQueue<>(3); 
	    Scanner scan = new Scanner(System.in);//create a scanner
	    System.out.print("\nEnter number of set question: ");
	    int num = scan.nextInt();//read the number of element
	    //read the course code
	    System.out.print("Enter the set question :\n");
	    scan.nextLine();
	  

	   //decrement the index
	     
	    do//repeat until the index will be 0
	    {
	    	
	    	AddNDelPape.offer(scan.nextLine());
	    	
	        num--; 
	        }
	     
	     while (num>0);
	    
	     
		//  System.out.println("LinkedBlockingQueue: " + AddNDelPape);
	      System.out.println(AddNDelPape);//print your list
	     // String element = AddNDelPape.peek();
	    //  System.out.println("Accessed Element: " + element);
	        
	     
	     
		    System.out.println("Do you want to remove the set? select 1.yess 2.no");
		    Scanner p = new Scanner(System.in);
		   int n =  p.nextInt();
		   {
			if (n==1)
			{       Scanner scan1 = new Scanner(System.in);
					scan1.nextLine();
				try {
					System.out.println("\nRemoved Element:"); 
					AddNDelPape.remove(scan1.nextLine());
					//System.out.println("removing element" +scan1.nextLine());
					System.out.println("newLinkedBlockingQueue: "+AddNDelPape);}
				
				catch (Exception e)
				{
					System.out.println(e);
			//
			//
		    
		    
		    //System.out.println("\nAre you sure? Insert removed element again.");
		    //AddNDelPape.remove(scan1.nextLine());
		    //scan1.close();
		    //System.out.println(AddNDelPape); 
		    
		    }}
			
			else {
				
				//
				System.out.println("The set are added.");
	            System.out.println(AddNDelPape);}
		   }
	            
	 
			} } 
		   
	   
	   
	    
	

	
	
	
	    
	    
