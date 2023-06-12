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
		//String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
			String d=in.next();
			char[] c=d.toCharArray();
			int t=d.length();
			if(t<=10) System.out.println(d);
			else {
				System.out.println(c[0]+""+(t-2)+""+c[(t-1)]);
			}
			
		}
		
		
}}
