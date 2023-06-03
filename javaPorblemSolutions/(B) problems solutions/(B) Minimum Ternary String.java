import java.util.Scanner;
 
public class Circle{
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		String s=in.next();
		char[] c=s.toCharArray();
		int i=0; 
   int zero=0,one=0,two=0;
		for( int k=0;k<c.length;k++)
		{
			if(c[k]=='0') zero++;
			if(c[k]=='1') one++;
			if(c[k]=='2') two++;
		}
		
		if(two==0)
		{
			for( int k=0;k<zero;k++)c[k]='0';
			for( int k=zero;k<c.length;k++)c[k]='1';
			
		}
		else if(zero==0)
		{
			for( int k=0;k<one;k++)c[k]='1';
			for( int k=one;k<c.length;k++)c[k]='2';
		}
		else if(one==0) {
			for( int k=0;k<c.length;k++)
			{
				System.out.print(c[k]);
				
			}
			return;
		}
		else {
			
			zero=0;
			one=0;
			two=0;
			char[]c2=new char[(c.length)];
			while(c[i]!='2')
			{
				if(c[i]=='0') zero++;
				if(c[i]=='1') one++;
				i++;
			}
			for( int k=0;k<zero;k++)c2[k]='0';
			for( int k=zero;k<i;k++)c2[k]='1';
			int j=i;
			String save="2";
			i++;
			one=0;
			while(i<c.length)
			{
				if(c[i]=='1') one++;
				else {
					save+=c[i];
				}
			i++;
			}
			char[] ww=save.toCharArray();
			int m=0;
			while(j<c.length)
			{
				if(one>0) {
					c2[j]='1';
					one--;
				}
				
				else 
					{
					c2[j]=ww[m];
					m++;
					}
			
			j++;}
			
			for( int k=0;k<c2.length;k++)
			{
				System.out.print(c2[k]);
				
			} // 0110201102
 
		
			return;
		}
		
		for( int k=0;k<c.length;k++)
		{
			System.out.print(c[k]);
			
		}
		
	
	} 
}