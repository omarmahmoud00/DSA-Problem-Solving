
import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
         int n=in.nextInt();
       // int m=in.nextInt();  
      int x=0;
      
          if(n<6) System.out.println(1);
          else
          {
        	  while(n>0)
        	  {
        		  n=n-5;
        		  x++;
        	  }
        	  System.out.println(x);
          }
  
}
}