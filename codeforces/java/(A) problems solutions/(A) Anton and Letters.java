import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
          
		String s=in.nextLine();
		char[] c=s.toCharArray();
		int h=0,i=0;
		for(i=0;i<c.length;i++)
		{
			if(c[i]=='{'||c[i]==' '||c[i]==','||c[i]=='}')
			{
 
				c[i]='?';
			}
		
			}
	
	for(i=0;i<c.length;i++)
	{
		for(int j=i+1;j<c.length;j++)
		{
			if(c[i]!='?')
			{
				if(c[i]==c[j]) c[j]='?';
			}
		}
	}
	for(i=0;i<c.length;i++) {
	if(c[i]!='?') h++;	
	}
	System.out.println(h);
}
}