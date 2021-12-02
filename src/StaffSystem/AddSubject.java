package StaffSystem;
import java.util.LinkedList;
import java.util.Scanner;


 public class AddSubject {
	

		// TODO Auto-generated method stub
	public void simple() {
	
	LinkedList<String> AddSubject = new LinkedList<>();
	Scanner p = new Scanner(System.in);//create a scanner
    System.out.print("\nEnter total subjects : ");
    int k = p.nextInt();//read the number of element
    System.out.print("Enter the course code and course name :\n");
    p.nextLine();
  do {
	  AddSubject.add(p.nextLine());
	  k--;
  }
  while (k>0);
  System.out.println(AddSubject);
  
	  System.out.println("Do you want to remove the set? select 1.yess 2.no");
	  Scanner l = new Scanner(System.in);
	  int n =  l.nextInt();
	  {
		  if (n==1)
		{    
			  
		    System.out.println("\nRemoved Element : ");
		    Scanner scan1 = new Scanner(System.in);
		    scan1.nextLine();
			System.out.println("\nAre you sure? Insert removed element again.");
		    AddSubject.remove(scan1.nextLine());
		    System.out.println(AddSubject); 
			
		}

				else {
					
					
					System.out.println("The subject are added.");
		            System.out.println(AddSubject);}
	}}}



