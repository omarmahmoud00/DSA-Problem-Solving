import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
        
       String s=in.next();
       char []x=s.toCharArray();
      char[]y=new char[26];
      int j=0;
      for(char i='a';i<='z';i++)
      { 
    	  y[j]=i;
    	  j++;
      }
     char w='a';
     int count=0;
      for(int i=0;i<x.length;i++)
      {
    	  char z=x[i];
    	  int ascii1 = (int) w;  
    	  int ascii2 = (int) z;
    	  int o=w-z;
    	  if(o<0) o=o*-1;
    	  if(o<(26-o)) count+=o;
    	  else count+=(26-o);
    	  w=z;
      }
     System.out.println(count);
     
}
}  