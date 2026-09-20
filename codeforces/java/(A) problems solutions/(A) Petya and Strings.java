import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
    //    int n=in.nextInt();
      //  int m=in.nextInt();  
      //int[][] x=new int [n][3];
      int u=0,l=0;
        
       String s1=in.next();
       String s2=in.next();
      String g= s1.toUpperCase();
      String k= s2.toUpperCase();
      
      char[] x=g.toCharArray();
      char[] y=k.toCharArray();
      
      for(int i=0;i<s1.length();i++)
      {  //System.out.println(x[i]+" "+y[i]);
    	  if(x[i]!=y[i])
    	  {
    		  int as1=x[i];
    		  int as2=y[i];
    		  if(as1>as2) u=1;
    		  else if(as1<as2) u=-1;
    		  
    		  break;
    			  
    	  }
      }
   
       System.out.println(u);
    
}
}