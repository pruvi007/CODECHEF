import java.util.*;
 
public class PERPALIN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int n = scan.nextInt();
			int p = scan.nextInt();
			StringBuffer s = new StringBuffer("");
			for(int i=0;i<p;i++)
			{
				if(i%2==0)
					s.append('a');
				else
					s.append('b');
			}
			
			
			StringBuilder sb = new StringBuilder(s);
			for(int i=0;i<p;i++)
			{
				if(sb.charAt(i)!=sb.charAt(p-i-1))
				{
					sb.setCharAt(p-i-1, sb.charAt(i));
				}
			}
			if(p==1 || n%p!=0 || p==2 || n==0 || p==0 || n==2)
				System.out.println("impossible");
			else if(p>n)
				System.out.println("impossible");
			else 
			{
				int cA=0,cB=0;
				for(int i=0;i<p;i++)
				{
					if(sb.charAt(i)=='a')
						cA++;
					if(sb.charAt(i)=='b')
						cB++;
							
				}
				int flag=0;
				if(cA==p || cB==p)
				{
					System.out.println("impossible");
					flag=1;
				}
				if(flag==0)
				{
					
					
					
						for(int i=0;i<n/p;i++)
							System.out.print(sb);
						System.out.println();
					
				}
			
			}
			
		}
	}
 
}
