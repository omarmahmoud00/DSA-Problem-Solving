import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a,p=0,c=0,y=0;
        for(int i=0;i<n;i++)
        {
            a=in.nextInt();
            if(a!=-1)
            {
            	p=p+a;
            }
            else
            {
            	if(p>0)
            	{
            		c++;
            		p=p+a;
            	}
            	else
            	{
            		c=c+a;
                	y=y+a;
            	}
            }
        }
        System.out.println(y*-1);
        
}
}
