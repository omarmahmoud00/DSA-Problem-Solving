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
       char []x=s.toCharArray();
   
         for(int i=0;i<s.length();i++)
         {       
             for(int j=i+1;j<s.length();j++)
             {
            	if(x[i]==x[j]) x[i]='?';
            
             }
          
         }
         for(int i=0;i<s.length();i++)
         {
         	if(x[i]!='?') u++;
         }
        if(u%2==0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    
}
}