package StaffSystem;
import java.util.Scanner;


public class search {


   class Node { 
          int key; 
          Node left, right; 
    
          public Node(int item) { 
              key = item; 
              left = right = null; 
          } 
      } 
    
      // Root of BST 
      Node root; 
    
      // Constructor 
      search() {  
          root = null;  
      } 
    
      // This method mainly calls insertRec() 
      void insert(int key) { 
         root = insertRec(root, key); 
      } 
        
      /* A recursive function to insert a new key in BST */
      Node insertRec(Node root, int key) { 
    
          /* If the tree is empty, return a new node */
          if (root == null) { 
              root = new Node(key); 
              return root; 
          } 
    
          /* Otherwise, recur down the tree */
          if (key < root.key) 
              root.left = insertRec(root.left, key); 
          else if (key > root.key) 
              root.right = insertRec(root.right, key); 
    
          /* return the (unchanged) node pointer */
          return root; 
      } 
    
      // This method mainly calls InorderRec() 
      void inorder()  { 
         inorderRec(root); 
      } 
    
      // A utility function to do inorder traversal of BST 
      void inorderRec(Node root) { 
          if (root != null) { 
              inorderRec(root.left); 
              System.out.println(root.key); 
              inorderRec(root.right); 
          } 
      } 
    
      // Driver Program to test above functions 
      public  void list() { 
    	  search tree = new search();
    	  
    //inorder = left top right
          /* Let us create following BST 
                50 
             /     \ 
            30      70 
           /  \    /  \ 
         20   40  60   80 */
    	  
          tree.insert(17181); 
          tree.insert(17182); 
          tree.insert(19201); 
          tree.insert(19203); 
          tree.insert(17183); 
          tree.insert(18193); 
          tree.insert(19202);
          tree.insert(18192); 
          tree.insert(18191); 
    
          // print inorder traversal of the BST 
          System.out.print("The existed sets of question for this subject :\n\n");
          tree.inorder(); 
      } 
  }