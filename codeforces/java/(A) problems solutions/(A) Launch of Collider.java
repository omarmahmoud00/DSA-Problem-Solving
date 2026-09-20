import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class exam2019 {
 
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            String s=in.next();
            char[] c=s.toCharArray();
            int x= 2147483647;
            int min=1;
          
            int[] arr=new int[(n)];
           for(int i=0;i<n;i++) arr[i]=in.nextInt();
           
                 for(int i=0;i<n-1;i++) {
                	 
                		 if(c[i]=='R'&&c[i+1]=='L')  x=Math.min(x, (arr[i+1]-arr[i])/2);
                	 
                 }
               if(x!=2147483647)  System.out.println(x);
               else System.out.println(-1);
                  
	}
}