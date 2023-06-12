import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int[][] arr=new int [n][2];
      for(int i=0;i<n;i++)
      {
    	  for(int j=0;j<2;j++)
    	  {
    		arr[i][j]=in.nextInt();  
    	  }
      }
      int count=0;
      for(int i=0;i<n;i++)
      {
    	  for(int j=0;j<n;j++)
    	  {
    		  if(arr[i][0]==arr[j][1]) count++;
    		 
    	  }
      }
     System.out.println(count);
     
}
}  