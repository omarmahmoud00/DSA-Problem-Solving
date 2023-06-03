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
		
		int w=0,t=0;
		for(int i=1;i<=n;i++)
		{  
			String a=in.next();
			char[] c=a.toCharArray();
			
				for(int j=0;j<a.length();j++)
			{ 
				
			if(c[j]!='z')
			    {
				    for(int p=0;p<=k;p++)
				      { 
				    	 int f=p+48;
					       if(c[j]==f) {
					    	   w++;
					    	   for(int z=0;z<a.length();z++) { if(c[z]==f) c[z]='z'; }
					    	   break;
					       }
			          }
			    }
			    
			}
			if(w==(k+1)) t++;
			
			w=0;
		}
		
		System.out.println(t);
		
}}
