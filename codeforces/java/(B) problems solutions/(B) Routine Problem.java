import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
 
	public static void cd(int a,int b,int c,int d)
	{
		int z=(a*d)-(b*c);
		int m =(b*c)-(a*d);
		int gcd=1;
		if(z>m) {
		 for (int i = 1; i <= z && i <= (a*d); i++) {
		        if (z % i == 0 &&(a*d) % i == 0) {
		            gcd = i;
		        }
		    }
		 System.out.println(z/gcd+"/"+(a*d)/gcd);
		}
		else {
			 for (int i = 1; i <= m && i <= (b*c); i++) {
			        if (m % i == 0 && (b*c) % i == 0) {
			            gcd = i;
			        }
			    }
			 System.out.println(m/gcd+"/"+(b*c)/gcd);
		}
		
		
	}
	public static void main(String[] args) {
		
		
 
		    Scanner in = new Scanner(System.in);
 
	    	int a=in.nextInt();
	    	int b=in.nextInt();
	    	int c=in.nextInt();
	    	int d=in.nextInt();
	    	
	       int z=a*b;
	       int s=c*d;
	       if((a==b)&&(c==d)) {
		    	System.out.println(0+"/"+1);
		    	return;
		    }
	
	       cd(a,b,c,d);
	   
	    	//System.out.println(f);
	    	//System.out.println(e);
	}  }