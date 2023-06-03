
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
		char[][] c=new char[n][n];
	int a=0;
		for(int i=0;i<n;i++)
		{
			String s=in.next();
			for(int j=0;j<n;j++)
			{
				c[i][j]=s.charAt(j);
			}
		}
	
		 char x=c[0][0];
		 char y= c[0][1];
		 if(x==y) {
			 System.out.println("NO");
				return;
		 }
		 
		 for(int i=0;i<n;i++)
			{
			// System.out.println(c[i][n-1-i]+" "+ x);
			 if(c[i][i]!=x||c[i][n-1-i]!=x)
				{
					System.out.println("NO");
					return;
				}
				for(int j=0;j<n;j++)
				{
					if(j!=i&&j!=(n-1-i)) {
						if(c[i][j]!=y)
						{
							System.out.println("NO");
							return;
						}
					}
				}
			}
            
		 System.out.println("YES");
		
}}