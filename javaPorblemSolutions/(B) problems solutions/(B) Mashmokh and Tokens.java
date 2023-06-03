import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
 
	public static void cd(long[] arr,int a,int b,int n)
	{
		
		
		for(int i=0;i<n;i++)
		{
			arr[i]=((arr[i]*a)%b)/a;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		} 
		
	}
	public static void main(String[] args) {
		
		
 
		    Scanner in = new Scanner(System.in);
			int n=in.nextInt();
	    	int a=in.nextInt();
	    	int b=in.nextInt();
	    
	    	   long[] arr=new long[n];
	    	
	    	for(int i=0;i<n;i++) arr[i]=in.nextLong();
	    	 cd(arr,a,b,n);
	  
	   
	    	
	}  }