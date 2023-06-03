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
		
	
		Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        double r1=0,x=0;
        for(int i=0;i<n;i++) { r1=in.nextDouble(); if(r1<x) r1=x; x=r1; }
        
           int m=in.nextInt();
           double p1=0,y=0;
           for(int i=0;i<m;i++)  {p1=in.nextDouble(); if(p1<y)p1=y; y=p1;}
           
               int k=in.nextInt();
               double p2=0;
            	 double  z=1999999999;
               for(int i=0;i<k;i++) {p2=in.nextDouble(); if(p2>z) p2=z; z=p2;}
               
                  double A=in.nextDouble();
                  double B=in.nextDouble();
               
      	 //  	System.out.println(r1);
      	 //   	  System.out.println(p1);
      	 //   	 System.out.println(p2);
      	  //  	System.out.println(A+" "+B); 
      	    	
                  System.out.println(Math.sqrt((r1*r1*p1*B)/((p1*B)+(p2*A))));
	
}}