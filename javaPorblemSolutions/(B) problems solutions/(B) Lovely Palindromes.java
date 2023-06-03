import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
	
		String s=in.next();
		char[] c=s.toCharArray();
		int j=c.length-1;
		for(int i=0;i<2*(c.length);i++) {
			 if(i<c.length)System.out.print(c[i]);
			 else {
				if(j>=0) {System.out.print(c[j]);
				 j--;
			 }}
		}
 
	}  }