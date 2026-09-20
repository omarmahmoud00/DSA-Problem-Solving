import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
	
		int n=in.nextInt();
		int j=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=i+1;
		}
		int x=in.nextInt();
		for(int i=0;i<x;i++)
		{
			int h=in.nextInt();
			for( j=0;j<n;j++)
			{
				if(h==arr[j]) arr[j]=0;
			}
		}
		int y=in.nextInt();
		for(int i=0;i<y;i++)
		{
			int h=in.nextInt();
			for( j=0;j<n;j++)
			{
				if(h==arr[j]) arr[j]=0;
			}
		}
		int w=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) 
				{
				w=1;
				break;
				}
			else w=0;
		}
		if(w==0)System.out.println("I become the guy.");
		else System.out.println("Oh, my keyboard!");
	}  }