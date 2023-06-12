import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
	
		int n=in.nextInt();
		char c[]= {'R','O','Y','G','B','I','V'};
		char c2[];
		int j=0;
		for(int i=0;i<n;i++) 
			{
			if(j<7) {
				System.out.print(c[j]);
				j++; }
			else {j=3;
				while(j<7&&i<n) {
				
				System.out.print(c[j]);
				j++;
				i++;
				if(j==7) j=3;
			}
				j=0;
			}
			
			}
	}  }