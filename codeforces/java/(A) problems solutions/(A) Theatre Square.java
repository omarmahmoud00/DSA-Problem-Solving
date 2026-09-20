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
		
		long n=in.nextLong();
		long m=in.nextLong();
		long a=in.nextLong();
		
		long  xn=n/a;
	    long  xm=m/a;
		
	    if(m%a!=0) xm++;
	    if(n%a!=0) xn++;
	    
		    System.out.println(xn*xm);
		        
	
		
}}