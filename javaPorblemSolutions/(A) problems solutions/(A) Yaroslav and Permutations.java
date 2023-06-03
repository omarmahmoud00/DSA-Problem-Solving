import java.io.*;
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;
import static java.lang.String.*;
public class cars {
	
	public static void main(String[] args) throws IOException  {
	
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		int[] arr2=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
			arr2[i]=0;
		}
		
		int x=0,y=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j]) arr2[i]++;
			}
		}
		Arrays.sort(arr2);
		int h=arr2[n-1];
		
	if(n%2==0){
		if(h<=(n/2)) System.out.println("YES");
			else System.out.println("NO");
	}
	else {
		if(h<=(n/2)+1) System.out.println("YES");
		else System.out.println("NO");
	}
}}
