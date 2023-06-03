import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class exam2019 {
 
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int j=1;
        int[] arr=new int[((2*n)+1)];
        
          for(int i=0;i<arr.length;i++)  arr[i]=in.nextInt();
      
          for(int i=0;i<arr.length;i++)
          {
        	  
                 if(j<=k)
                 { 
                	 if(i%2!=0) {
                		 
                	 int x=arr[i-1];
               	  int y=arr[i];
               	  int z=arr[i+1];
               	  
               	  if(x<(y-1)) {
               		  if(z<(y-1))
               		  {
               			  arr[i]=arr[i]-1;
               			  j++;
               		  }
               	  }
                	 }
                 }
                 else {
                	 break;
                 }
                    
          
                 }
       
          for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
	     
	}
}