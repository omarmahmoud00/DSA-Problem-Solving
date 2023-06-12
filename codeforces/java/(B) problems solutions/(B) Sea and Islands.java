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
       
		int n = in.nextInt();
		int k = in.nextInt();
 
		if (n % 2 == 0) {
			if (k > ((n * n) / 2)) {
				System.out.println("NO");
				return;
			}
		}
 
		if (n % 2 != 0) {
			if (k > (((n * n) + 1) / 2)) {
				System.out.println("NO");
				return;
			}
		}
 
		int h=k;
		char[][] sea =  new char[n][n];
 
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sea[i][j] = 'S';
			}
		}
		int c = 0;
		for (int i = 0; i < n; i++) {
			
			if (i % 2 == 0) c=0;
			else c = 1;
 
			while (c<n&&k>0) {
				
				sea[i][c] = 'L';
				c += 2;
				k--;
				
			}
			
			
			
		}
		System.out.println("YES");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
			
				System.out.print(sea[i][j]);
			}
			System.out.println();
		}
		
		
	}
}