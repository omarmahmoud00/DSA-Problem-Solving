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
 
          if (n==0)  System.out.println(1);
          else {
        	  int[] x= {8,4,2,6};
        	  n=(n-1)%4;
        	  System.out.println(x[n]);
          }
				
}}