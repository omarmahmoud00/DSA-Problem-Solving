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
		int[][] arr=new int[n][3];
		int x=0,y=0,z=0;
		
		if(n<3) {
			System.out.println(0);
			return;
		}
		
		for(int i=0;i<n;i++)
		{  
			int c=in.nextInt();
			
				 if(c==1) {
					 arr[i][0]=1;
					 arr[i][1]=0;
					 arr[i][2]=0;
					 x++;
				 }
				 else if(c==2) {
					 arr[i][0]=0;
					 arr[i][1]=2;
					 arr[i][2]=0;
					 y++;
				 }
				 else  {
					 arr[i][0]=0;
					 arr[i][1]=0;
					 arr[i][2]=3;
					 z++;
				 }
		}
		
		  if(x==0||y==0||z==0)
		  {
			  System.out.println(0);
				return; 
		  }
		              int[] min = {x,y,z};
		              Arrays.sort(min);
		              int r=min[0];
		              System.out.println(r);
		              while(r>0)
		              {  
		            	  int i=0;
		            	  while(i<n) {
		            		  if(arr[i][0]!=0) {
		            			  System.out.print((i+1)+" ");
		            			  arr[i][0]=0;
		            			  break;
		            		  }
		            		  i++;
		            	  }
		            	  i=0;
		            	  while(i<n) {
		            		  if(arr[i][1]!=0) {
		            			  System.out.print((i+1)+" ");
		            			  arr[i][1]=0;
		            			  break;
		            		  }
		            		  i++;
		            	  }
		            	  i=0;
		            	  while(i<n) {
		            		  if(arr[i][2]!=0) {
		            			  System.out.print((i+1)+" ");
		            			  arr[i][2]=0;
		            			  break;
		            		  }
		            		  i++;
		            	  }
		            	  System.out.println(" ");
		            	  r--;
		            	 
		              }
		         
}}