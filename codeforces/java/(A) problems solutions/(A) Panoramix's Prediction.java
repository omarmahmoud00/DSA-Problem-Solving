import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;
import static java.lang.String.*;
public class cars {
	
	public static void main(String[] args) throws IOException  {
	
		Scanner in = new Scanner(System.in);
		
		int n=in.nextInt();
		int m=in.nextInt();
		int c=0;
		    if(n==2&&m==3){ System.out.println("YES"); return; }
		    
		       for(int i=(n+1);i<m;i++)
		       {
		    	      for(int j=2;j<i;j++)
		    	      {   //2  System.out.println(i+" "+j);
		    	    	    if(i%j==0) 
		    	    	    	{
		    	    	    	c++;
		    	    	    	break;
		    	    	    	
		    	    	    	}
		    	    	    
		    	      }
		    	    
		       }
		       if(c!=(m-n-1)) { System.out.println("NO"); return;}
		       c=0;
		       for(int i=2;i<m;i++)
		       {
		    	   if(m%i==0) c++;
		    	   
		       }
		       if(c!=0) System.out.println("NO");
		       else System.out.println("YES");
		        
	
		
}}