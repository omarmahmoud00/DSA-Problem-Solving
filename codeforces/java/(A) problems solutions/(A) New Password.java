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
		int k=in.nextInt();
		char[] c= new char[k];
		char x=97;
		
		for(int i=0;i<k;i++)
		{
			c[i]=x;
			x++;
		}
		int m=0;
		for(int i=0;i<n;i++)
		{
		  if(m<k) {
			  System.out.print(c[m]);
			  m++;
			  if(m==k)m=0;
		  }
		}        
}}