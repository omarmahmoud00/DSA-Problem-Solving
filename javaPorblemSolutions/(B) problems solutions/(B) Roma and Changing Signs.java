import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class exam2019 {
 
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
            
            int n=in.nextInt();
            int k=in.nextInt();
            
            int[] arr=new int[n];
            int c=k,j=0;
            for(int i=0;i<n;i++) arr[i]=in.nextInt();
            
            	   while(j<Math.min(n, k)) {
            	if(arr[j]<0 ) {
            		arr[j]=(arr[j]*(-1));
            		   c--;
            	}
            		   j++;
            		
            	   }
            	   Arrays.sort(arr);
            	   int d=0;
            	   for(int i=0;i<n;i++) {
            		   d+= arr[i];
            	   }
            	if(c==0)  {
            		
            		System.out.println(d);
            		return;
            	}
            	else {
            	if(c%2!=0)	System.out.println(d-(2*arr[0]));
            	else System.out.println(d);
            	}
            
            	
	}
}