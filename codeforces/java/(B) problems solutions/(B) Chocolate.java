import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class exam2019 {
 
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
            
            long n=in.nextLong();
            long k=1,x=0,y=0;
            long p=0;
            long[] arr=new long[200];
           for(int i=0;i<n;i++)
           {      
        	   p=in.nextLong();
        	   if(p==0) y++;
        	   else x++;
        	   arr[i]=p;
        	   
           }
          if(x<1) {
        	  System.out.println(0);
        	  return;
          }
           for(int i=0;i<n;i++)
           {      
        	  if(arr[i]==1) {
        		  for(int j=i+1;j<n;j++)
        		  {
        			  if(arr[j]==1) {
        				  k=k*(j-i);
        				  break;
        			  }
        		  }
        	  }
	}
           System.out.println(k);
}}
