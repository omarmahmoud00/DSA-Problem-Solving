import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;
import static java.lang.String.*;
public class cars {
	
	 static boolean valid(int x,int y,int m,int n)
	{
		return (x>-1)&&(x<n)&&(y>-1)&&(y<m);
	}
	
	
	public static void main(String[] args) throws IOException  {
		
	
		Scanner in=new Scanner(System.in);
       
		int n = in.nextInt();
		int m = in.nextInt();
		String pr=in.next();
		char prc=pr.charAt(0);
		char[][] c=new char[n][m];
		int colum=0,row=0,colum2;
		for(int i=0;i<n;i++)
		{   
			String s=in.next();
			for(int j=0;j<m;j++)
			{
				c[i][j]=s.charAt(j);
				
			}
			
		}
		int xx[]= {-1,0,1,0};
		int yy[]= { 0,1,0,-1};
		String ans="/";
		
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
			{
				if (c[i][j] == prc)
					for (int k =0 ; k < 4; k++)
					{
						int tox = i + xx[k];
						int toy = j + yy[k];
						if (valid(tox, toy,m,n)&& c[tox][toy] != prc && c[tox][toy] != '.') ans+=c[tox][toy];
							
					}
			}
//		System.out.println(ans);
		int ff = 0;
		for (int i = 0; i < ans.length(); i++) {
			if (ans.charAt(i) != '/') {
				ff++;
				for (int j = i - 1; j >= 0; j--) {
 
					if(ans.charAt(i)==ans.charAt(j))
					{
						ff--;
						break;
					}
					
				}
			}
 
		}
		
	  System.out.println(ff);
//	int i=row,j=0;
 
		
		
}}