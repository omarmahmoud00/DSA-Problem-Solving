import java.util.*;
import java.io.*;
import java.util.Arrays;
 
public class inheritance {
	public static void main(String[] args) {
 
		Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int r=in.nextInt();
  //   if(r>n)   System.out.println(r);
 //    else {
    int i=1;
     while(i<999999)
     { 
    	 int x=i*n;
    	 if(x%10==0||(x-r)%10==0) {
    		 System.out.println(i); break;
    	 }
    	 i++;
     } 
//     }
     
}
}  