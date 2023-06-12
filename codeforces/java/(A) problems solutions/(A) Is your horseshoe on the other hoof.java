import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
    int [] arr=new int [4];
    int c=0;
    for(int i=0;i<4;i++) arr[i]=in.nextInt();
    for(int i=0;i<4;i++)
    {
    	for(int j=i+1;j<4;j++)
    	{
    		if(arr[i]==arr[j])
    			{
    			c++;
    			arr[j]=j*-1;
    			}
    		
    	}
    	//if(c==3) break;
    }
    System.out.println(c);
     
}
}  