import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
	int n,j=0,i=0,f=0;  
	int d,b;
	Scanner sc= new Scanner(System.in);
	//System.out.println("enter n");
    n=sc.nextInt();
  //  System.out.println("enter b");
    b=sc.nextInt();
  //  System.out.println("enter d");
    d=sc.nextInt();
     
     int[]arr=new int[n];
    // int[]arr2=new int[9];
     for(i=0;i<n;i++)
     {
    	 f=sc.nextInt();
    	 if(f<=b) arr[i]=f;
    	 else arr[i]=0;
     }
     int w=d;
      for(i=0;i<n;i++)
      {     d=d-arr[i]; 
    	  if(d<0) 
    			  {
    		  j++;
    		  d=w;
    			  }
    	   
      }
      
      System.out.println(j);
 
}
}
