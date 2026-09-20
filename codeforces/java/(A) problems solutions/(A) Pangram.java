import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
	
		int n=in.nextInt();
		String s=in.next();
		String k=s.toLowerCase();
		char[] c= k.toCharArray();
		int f=0;
		Arrays.sort(c);
		int y=0;
		for(int i=0;(i+1)<c.length;i++)
		{  
			int x=c[i];
			 y=c[i+1];
		
			if((x+1)==y) {
				f=0;
			}
			else if(x==y)
			{
				f=0;
			}
			else {
				f=1;
				break;
			}
		}
	
		if(c.length<26) System.out.println("No");
		else if(c[0]!='a'||c[c.length-1]!='z') System.out.println("No");
		else {
		if(f==0)   System.out.println("YES");
		else System.out.println("No");
		}
		
	}  }
