import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
	
		long n=in.nextLong();
		long k=in.nextLong();
		
		if(n%2==0)
		{
			if(k>(n/2))	 System.out.println(k-(n-k));
			else System.out.println(k+(k-1));
		}
		else 
		{
			if((k-1)>(n/2)) System.out.println(k-(n-k)-1);
			else System.out.println(k+(k-1));
				
		}
	}  }
