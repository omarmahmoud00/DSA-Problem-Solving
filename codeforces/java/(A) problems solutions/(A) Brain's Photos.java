import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int x=0;
       for(int i=0;i<n;i++)
       {   
    	   for(int j=0;j<m;j++)
    	   {
    		   String s=in.next();
    		   if(s.equals("C")||s.equals("M")||s.equals("Y")) 
    			   {
    			   x=1;
    			   break;
    			   }
    	   }
    	
 
 
       }
       if(x==0) System.out.println("#Black&White");
       else System.out.println("#Color");
      
}
}