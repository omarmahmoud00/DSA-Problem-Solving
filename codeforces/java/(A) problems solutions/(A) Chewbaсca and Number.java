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
		
		String s=in.next();
		char[] d=new char[s.length()];
		//57
		// if(y=='9') System.out.println(y);
		for(int i=0;i<s.length();i++) {
			char y=s.charAt(i);
			int x=y;
			if(i==0) {
				if(y=='9') System.out.print(y);
				else {
					if(x<=52) System.out.print(y);
					else System.out.print(57-x);
				}
			}
			else {
				if(x<=52) System.out.print(y);
				else System.out.print(57-x);
			}
		}
}}