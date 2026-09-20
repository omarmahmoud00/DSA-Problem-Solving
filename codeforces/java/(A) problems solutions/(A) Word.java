import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
    //    int n=in.nextInt();
      //  int m=in.nextInt();  
      //int[][] x=new int [n][3];
      int u=0,l=0;
        
       String s=in.next();
     
         for(int i=0;i<s.length();i++)
         {   
             char x=s.charAt(i);
             int ascii = (int)x;
             if(ascii>64&&ascii<91) u++;
             else l++;
         
         }
         
         if(u<=l) System.out.println(s.toLowerCase());
         else System.out.println(s.toUpperCase());
     
         
}
}