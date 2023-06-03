import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
         int n=in.nextInt();
        int m=in.nextInt();  
      int x=0;
      
      while(n<=m)
      {
    	  n=n*3;
    	  m=m*2;
    	  x++;
      }
        
        	  System.out.println(x);
}
}