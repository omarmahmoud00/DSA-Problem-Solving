import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
    String s1=in.next();
    char[] c1=s1.toCharArray();
    String s2=in.next();
    char[] c2=s2.toCharArray();
    int c=0;
    int j=0;
    for(int i=0;i<c2.length;i++)
    {
    	
    	if(c1[j]==c2[i])
    	{
    		c++;
    		j++;
    	}
    }
    
    System.out.println(c+1);
     
}
} 