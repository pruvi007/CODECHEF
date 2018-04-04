import java.util.*;
 
public class CHEFEXQ {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = scan.nextInt();
		}
		int xor[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			int xo = 0;
			for(int j=0;j<=i;j++)
			{
				xo = xo^a[j];
			}
			xor[i]=xo;
		}
		while(q-->0)
		{
			int x = scan.nextInt();
			if(x==1)
			{
				int ind = scan.nextInt();
				int num = scan.nextInt();
				for(int i=ind-1;i<n;i++)
					xor[i] = xor[i]^a[ind-1];
				a[ind-1] = num; 
				for(int i=ind-1;i<n;i++)
				{
					
					xor[i]=xor[i]^num ;
				}
				
			}
			if(x==2)
			{
				int ind = scan.nextInt();
				int k = scan.nextInt();
				int c=0;
				for(int i=0;i<ind;i++)
				{
					if(xor[i]==k)
						c++;
				}
				System.out.println(c);
			}
		}
	}
 
}
