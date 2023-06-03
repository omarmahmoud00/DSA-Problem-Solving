import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
         int n=in.nextInt();
      //  int m=in.nextInt();  
      //int[][] x=new int [n][3];
      int s=0,d=0,c=0;
    
         for(int i=0;i<n;i++)
         {    d=0;
        	   for(int j=0;j<3;j++)
        	   {
        		   s=in.nextInt();
        		   if(s==1) d++;
        	   }
        	   if(d>=2)c++;
        	   
         }
      	System.out.println(c);
}
}