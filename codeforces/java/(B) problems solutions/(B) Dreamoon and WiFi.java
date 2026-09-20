import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class exam2019 {
 
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
            String s1=in.next();
            char[] c1=s1.toCharArray();
            
            String s2=in.next();
            char[] c2=s2.toCharArray();
           
            
            int p1= 0,n1=0;
            int p2= 0,n2=0,g1=1;
            int g=0;
            
            for(int i=0;i<c1.length;i++)
            {
            	if(c1[i]=='+') p1++;
            	else n1--;
            }
          
            for(int i=0;i<c2.length;i++)
            {
            	if(c2[i]=='+') p2++;
            	else if(c2[i]=='-') n2--;
            	else g++;
            }
            int y=1;
            for(int i=0;i<g;i++) y*=2;
            
            int [] arr=new int[y];
            int r1=0;
            double r2=0;
            
            for(int i=0;i<y;i++) arr[i]=0;
       
         if(g==0) { 
        	 if(p1==p2&&n1==n2) {
        		 System.out.println("1.0");
        		 return;
        	 }
        	 else  System.out.println("0.0");
        	
        	
         }
         else {
        	 r1=(p1+n1)-(p2+n2);
        	 int x=0;
        	 int h=1;
        	 for(int i=0;i<g;i++) {
        		  h=h*2;
        		  int o=0;
        		 while(o<y) {
        			  x=(y/h);
        		   while(x>0) {
        				  arr[o]++;
        				  x--;
        				  o++;
        			  }
        		   x=(y/h);
        			  while(x>0) {
        				  arr[o]--;
        				  x--;
        				  o++;
        			  }
        			
        		 }
        		 
        	 }
        	 
        	 for(int i=0;i<y;i++)
        	 {
        		 if(r1==arr[i]) r2++;
        	 }
        	 double e=r2/y;
        	 System.out.println(e);
         }
            
                  
	}
}
