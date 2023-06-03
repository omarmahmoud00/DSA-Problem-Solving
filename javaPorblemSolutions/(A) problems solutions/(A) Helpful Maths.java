import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
	
		String s=in.next();
		char[] c=s.toCharArray();
		
		Arrays.sort(c);
		int j=c.length/2 ;
		int i=0;
		int k=0;
		char[] c2=new char[c.length];
		for(i=0;i<c.length;i++)
		{
			if(i%2!=0) c2[i]='+';
			else {
				c2[i]=c[k+j];
			k++;
			}
		}
 for(i=0;i<c.length;i++)System.out.print(c2[i]);
	
	
              
	}  }