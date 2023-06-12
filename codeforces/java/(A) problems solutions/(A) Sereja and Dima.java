import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
         int n=in.nextInt();
      //  int m=in.nextInt();  
      int[] x=new int [n];
      int s=0,d=0;
      for(int i=0;i<n;i++)
      {
    	  x[i]=in.nextInt();
      }
      int j=n-1;
      int y=0;
        for(int i=0;i<n;i++)
        {    
        	if(i%2==0)
        	{ 
        		if(x[y]<x[j]) 
        			{
        			s+=x[j];
        			j--;
        			}
        		else {
        			s+=x[y];
        			y++;
        		}
        	}
        	else
        	{
        		if(x[y]<x[j]) {
        			d+=x[j];
        			j--;
        		}
        		else  {
        			d+=x[y];
        			y++;
        		}
        	}
      
        	}
      	System.out.println(s+" "+d);
}
}