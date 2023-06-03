import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Set;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
	
		int n=in.nextInt();
		int c=0;
		int [] arr=new int [n];
		for(int i=0;i<n;i++)
		{
			int x=in.nextInt();
			int y=in.nextInt();
			if(x==y) arr[i]=x;
			else {
				c=2;
				break;
			}
		}
		if(c==2) System.out.println("rated");
		else {
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(arr[i]<arr[j]) {
						c=1;
						break;
					}
				}
			}
		}
		if(c==0) System.out.println("maybe");
		else if(c==1) System.out.println("unrated");
	}  }