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
		int[][] arr=new int [4][2];
		
		for(int i=0;i<4;i++)
		{
			arr[i][0]=i+1;
			arr[i][1]=in.nextInt();
		}
		
		int co=0;
		String s=in.next();
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			int x=9-(57-c[i]);
			co+=arr[x-1][1];
			
		}
		
		System.out.println(co);
}}