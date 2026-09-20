import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
	public static int arr[] =new int[1000001];
   public static long d(int a)
   {
	  long ff=0;
	 
 	  if(arr[a]!=0) { return arr[a]; }
 	  
 	 int i, c = 0;
 	for (i = 1; i * i <= a; i++) {
 		if (a % i == 0) {
 			if (i * i != a) {
 				c++;
 			}
 			c++;
 		}
 	}
 	arr[a] = c;
 	return c;
   }
	
	
	public static void main(String[] args) {
		
		
 
		    Scanner in = new Scanner(System.in);
			
		   int a=in.nextInt(); 
		   int b=in.nextInt(); 
		   int c=in.nextInt();
		   long ff=0;
		  
		  int x=0,y=0;
		   long mod= 1073741824;
		    
	    	for(int i=1;i<=a;i++)
	    	{
	    		   for(int j=1;j<=b;j++)
	    		   {
	    			      for(int k=1;k<=c;k++)
	    			      {
	    			    	ff+=d(i*j*k);
	    			    	
	    			      }
	    		   }
	    	}
	    	//for(int i=0;i<=((a*b*c));i++) {if(arr[i]!=0) System.out.println(arr[i]);}
	    	System.out.println(ff%mod);
	}  }