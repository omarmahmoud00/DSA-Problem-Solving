import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   int[] arr=new int [n];
   for(int i=0;i<n;i++)
   {
	   arr[i]=in.nextInt();
   }
   int x=in.nextInt();
   int ar=0;
   int q=0;
   int p=0;
   int f=0;
   for(int i=0;i<x;i++)
   {
	   q=in.nextInt();
	   q=q-1;
	   p=in.nextInt();
	   f=arr[q]-p;
	   if(q+1<n) arr[q+1]+=f;
	   if(q-1>=0) arr[q-1]+=(arr[q]-f)-1;
	  
  arr[q]=0;
	
	   }
    
   for(int t=0;t<n;t++)
   {
    System.out.println(arr[t]);
   }
   
 
}
} 