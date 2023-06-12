import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
	
		String s= "a";
		char[] c=new char[3];
		char [] c2=new char [3];
		for(int i=0;i<3;i++)
		{
			s=in.next();
			c=s.toCharArray();
			if(c[1]=='<') c2[i]=c[2];
			else c2[i]=c[0];
			
		}
		int A=0;
		int B=0;
		int C=0;
		for(int i=0;i<3;i++)
		{
			if(c2[i]=='A') A++;
			else if(c2[i]=='B') B++;
			else C++;
		}
		if(A>B&&B>C) System.out.println("CBA");
		else if(A>C&&C>B) System.out.println("BCA");
		else if(B>A&&A>C) System.out.println("CAB");
		else if(B>C&&C>A) System.out.println("ACB");
		else if(C>A&&A>B) System.out.println("BAC");
		else if(C>B&&B>A) System.out.println("ABC");
		else System.out.println("Impossible");
		
}  }