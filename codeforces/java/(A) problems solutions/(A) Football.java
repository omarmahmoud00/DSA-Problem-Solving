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
		String s1=in.next();
		String s3="e";
		int x=1;
		int y=0;
		
		if(n<3) System.out.print(s1);
		else 
		{ String s2=in.next();
		if(s1.equals(s2)) x++;
	    else {
	    	y++;
	    	s3=s2;
	    }
	//	s1=s2;
			for(int i=2;i<n;i++)
			{   
				s2=in.next();
				if(s1.equals(s2)) x++;
			    else {
			    	s3=s2;
			    	y++;
			    }
			//	s1=s2;
				
				
			}
			if(x>y) System.out.println(s1);
			else System.out.println(s3);
			
		}
 
}}