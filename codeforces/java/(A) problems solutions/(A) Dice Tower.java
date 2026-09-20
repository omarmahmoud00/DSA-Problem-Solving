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
		
		for(int i=1;i<=2*n;i++)
		{  
			int a=in.nextInt();
			if(a==k||a==(7-k))
			{
				System.out.println("NO");
				return;
			}
		}
		
				
		System.out.println("YES");
		
}}