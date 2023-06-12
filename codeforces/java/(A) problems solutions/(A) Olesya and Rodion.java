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
		int b =in.nextInt();
		char s[]=new char[n];
		int a=1;
		s[0]='1';
		
		if(n>=2)
		{
		if(b!=10)for(int i=0;i<n;i++)System.out.print(b);
		else {
		 
			for(int i=1;i<n;i++)
			{
				s[i]='0';
			}
			for(int i=0;i<n;i++)System.out.print(s[i]);
		}
		}
		else {
			if(b>=10)System.out.print("-1");
			else System.out.print(b);
		}
 