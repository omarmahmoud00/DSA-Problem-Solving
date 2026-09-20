import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      //  int m=in.nextInt();  
      //int[][] x=new int [n][3];
      int d=9,c=0;
        
   
        
         for(int i=0;i<n;i++)
         {   
              int x=in.nextInt();
              if(x!=d) c++;
        	 
              d=x;
         }
         
         System.out.println(c);
      	
}
}