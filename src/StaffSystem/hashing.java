package StaffSystem;
import java.util.*; 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashing {//search paper

  private static final boolean Integer = false;
  private static Scanner input1;
  
  
  final static int MAX = 100000; //size for each element
    
  // Since array is global, it  
  // is initialized as 0.  
  
  static boolean[][] has = new boolean[MAX + 1][2]; 
    
  // searching if X is Present in  
  // the given array or not.  
  static boolean search(int X)  
  { 
      if (X >= 0)  
      { 
          if (has[X][0] == true)  
          { 
              return true; 
          }  
          else 
          { 
              return false; 
          } 
      } 
    
      // if X is negative take the  
      // absolute value of X.  
      X = Math.abs(X); 
      if (has[X][1] == true)  
      { 
          return true; 
      } 
    
      return false; 
  } 
    
  static void insert1(int a[], int n)  
  { 
      for (int i = 0; i < n; i++)  
      { 
          if (a[i] >= 0)  
          { 
              has[a[i]][0] = true; 
          }  
          else 
          { 
              has[Math.abs(a[i])][1] = true; 
          } 
      } 
  } 
    
  
   public  void arrange() 
      { 
     Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your required year exam paper and edition : ");
        int X = input1.nextInt();
          // creating a hash table 
        Hashtable<Integer, String> h = new Hashtable<Integer, String>(); //create hash table
        int a[] = {17181, 17182, 17183, 18191, 18192, 18193, 19201, 19202, 19203}; 
        int n = a.length; 
        insert1(a, n); 
       
        if (search(X) == true) 
        { 
            System.out.println("Exam Paper Existed"); 
        }  
        else 
        { 
            System.out.println("Data Not Existed"); 
        } 
    }
  private static boolean search(int[] a) {
    // TODO Auto-generated method stub
    return false;
  }
  private static void insert(int[] a, int n) {
    // TODO Auto-generated method stub
    
  } }