package StaffSystem;

import java.util.Scanner;

public class BTSNode2 {
	 private static Scanner node;
	  private static Scanner input1;

	  // Binary tree node  
	  static class Node  
	  {  
	      int data;  
	      Node left, right;  
	      Node(int data)  
	      {  
	          this.data = data;  
	          left = right = null;  
	      }  
	  };  
	    
	  // Function to traverse the tree in preorder  
	  // and check if the given node exists in it  
	  static boolean ifNodeExists( Node node, int key)  
	  {  
	      if (node == null)  
	          return false;  
	    
	      if (node.data == key)  
	          return true;  
	    
	      // then recur on left sutree / 
	      boolean res1 = ifNodeExists(node.left, key);  
	      if(res1) return true; // node found, no need to look further 
	    
	      // node is not found in left, so recur on right subtree / 
	      boolean res2 = ifNodeExists(node.right, key);  
	    
	      return res2;  
	  }  
	  
	    
	  // Driver Code  
	  public void cari() 
	  {  
	    
	    Scanner input1 = new Scanner(System.in);
	        System.out.println("Enter your required year exam paper and edition : ");
	        int key = input1.nextInt();
	        
	        Node root = new Node(18194);  
	      root.left = new Node(17181);   
	      root.left.right = new Node(17183);  
	      root.left.right.left = new Node(17182);  
	      root.left.right.right = new Node(18192); 
	      root.left.right.right.left = new Node(18191); 
	      root.left.right.right.right = new Node(18193); 
	      root.right = new Node(19202);  
	      root.right.left = new Node(19201);  
	      root.right.right = new Node(19203);  
	    
	      
	    
	      if (ifNodeExists(root, key))  
	          System.out.println("YES, there is " + key);  
	      else
	          System.out.println("NOT Exist");  
	      
	  }

	}


