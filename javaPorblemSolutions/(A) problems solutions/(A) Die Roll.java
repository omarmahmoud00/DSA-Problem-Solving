import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
   int x=in.nextInt();
   int y=in.nextInt();
   int w=Math.max(x, y);
   
   if(w==1) System.out.println("1/1");
   else if(w==2) System.out.println("5/6");
   else if(w==3) System.out.println("2/3");
   else if(w==4) System.out.println("1/2");
   else if(w==5) System.out.println("1/3");
   else if(w==6) System.out.println("1/6");
 
}
} 