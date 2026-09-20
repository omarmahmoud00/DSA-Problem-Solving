import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      //  int m=in.nextInt();  
      //int[][] x=new int [n][3];
      int d=0,c=0;
        char x='a';
        String s=in.next();
        
         for(int i=0;i<n;i++)
         {   
        	 char y=s.charAt(i);
        	 if(y==x) c++;
        	
        	 x=y;
        	 
         }
         
         System.out.println(c);
      	
}
}