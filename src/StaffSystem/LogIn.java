package StaffSystem;

import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		

	    String ID;
	    String Password;

	    Password = "abcd234";
	    ID = "1145";

	    Scanner input1 = new Scanner(System.in);
	    System.out.println("ID : ");
	    String username = input1.next();

	    Scanner input2 = new Scanner(System.in);
	    System.out.println("Password : ");
	    String password = input2.next();

	    if (username.equals(ID) && password.equals(Password)) {
            
	        System.out.println("Access Granted! Welcome!");//can be proceed to the main menu
	        
	     Scanner scan = new Scanner(System.in);
	     char n;
	      
		do {
	    	  
	       System.out.println("Select Option\n A.Add Subject\n B.Add and Delete Paper Set \n C.List of Past Year Paper\n D.Search for Past Year Paper\n E.Student Data F.Exit");
	       n = scan.next().charAt(0);
	      
			switch (n)
	        
	        {
	        case 'A' : AddSubject hai = new AddSubject();
	                   hai.simple();
	        break;
	        case 'B' :  AddNDelPaper hoi = new AddNDelPaper();
	                   hoi.edit();
	        break;
	        case 'C' : search cute = new search();
	                   cute.list();
	        break;
	        case 'D' : hashing eww = new hashing();
                       eww.arrange();
	        break;
	        case 'E' : QuickSort ayuhh = new QuickSort();
                        ayuhh.data();
	        break;
	        case 'F' : System.out.println("Thank You");
	        break;
	        }
			
	      }
	      while ( n !='.');
	    	  
	    	  System.out.println("Insert the option  A, B, C, D, E, F");
	        
	       
	}
	    else {
	    	System.out.println("Invalid ID or Password");
	    }
	}}


