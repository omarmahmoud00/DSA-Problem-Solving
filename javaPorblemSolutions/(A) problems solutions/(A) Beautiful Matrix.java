import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
      //   int n=in.nextInt();
      //  int m=in.nextInt();  
      //int[][] x=new int [n][3];
      int s=0,d=0,c=0;
    
         for(int i=0;i<5;i++)
         {   // d=0;
        	   for(int j=0;j<5;j++)
        	   {
        		   s=in.nextInt();
        		   if(s==1) {
        			   d=i+1; c=j+1;
        			    int y=c-3;
        		         int x=d-3;
        		         if(x<0) x=x*-1;
        		         if(y<0) y=y*-1;
        		         System.out.println(x+y);
        			   break;
        		   }
        	   }
        	   
        	   
         }
         
     
      	
}
}