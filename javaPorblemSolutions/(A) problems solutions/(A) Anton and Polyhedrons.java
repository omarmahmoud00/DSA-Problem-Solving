
import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int x=0;
       for(int i=0;i<n;i++)
       {
    	   String s=in.next();
    	   if(s.equals("Tetrahedron")) x=x+4;
    	   else if(s.equals("Cube")) x=x+6;
    	   else if(s.equals("Octahedron")) x=x+8;
    	   else if(s.equals("Dodecahedron")) x=x+12;
    	   else if(s.equals("Icosahedron")) x=x+20;
    	  // else if(s=="Cube") x=x+6;
       }
       System.out.println(x);
}
}