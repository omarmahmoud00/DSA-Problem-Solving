import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class exam2019 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		 n=sc.nextInt();
		int[] arr=new int[n];
            int y=1;
            int x=1;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		         
		           for(int i=1;i<n;i++)
		           {
		        	    if(arr[i]==arr[0]) x++;
		        	    else break;
		           }
		           
		          if(x<n) 
		          {	 for(int i=n-2;i>=0;i--)
		           {
		        	    if(arr[i]==arr[n-1]) y++;
		        	    else break;
		           }
		          }
		          
		          if(n-x-y<0)  System.out.println(0);
		          else System.out.println(n-x-y);
	}
}