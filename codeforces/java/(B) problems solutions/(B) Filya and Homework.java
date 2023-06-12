import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class exam2019 {
 
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
            
            int n=in.nextInt();
            int x=-1,y=-1,z=-1,r=1;
                 
             for(int i=0;i<n;i++)
             {
            	 int k=in.nextInt();
            	 if(i==0) x=k;
            	 else {
            		 if(k!=x&&r<2) {
            			 y=k;
            		     r++; 
            		 }
            		 else if(y!=-1&&r<3&&k!=y&&k!=x) {
            			 z=k;
            			 r++;
            		 }
            	 }
            	 if(r>=3&&k!=x&&k!=y&&k!=z) r++;
            	 if(r>3) { System.out.println("NO"); return; }
             }
             
           if(r<3) {System.out.println("YES");  return; }
           else {
        	   int[] arr= {x,y,z};
               Arrays.sort(arr);
               
               
            	if((arr[1]-arr[0])==(arr[2]-arr[1])) {System.out.println("YES");  return; }
            	else {System.out.println("NO");  return; }
           
           }
           
          //      System.out.println(x+" "+y+" "+z+" "+r);
                
}}