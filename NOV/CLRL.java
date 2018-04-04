import java.util.*;
 
public class CLRL{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int n = scan.nextInt();
			long r = scan.nextLong();
			long a[] = new long[n];
			for(int i=0;i<n;i++)
			{
				a[i] = scan.nextLong();
			}
			long left[] = new long[n];
			long right[] = new long[n];
			int k1=0,k2=0;
			for(int i=0;i<n-1;i++)
			{
				if(a[i]<a[n-1])
					left[k1++] = a[i];
				if(a[i]>a[n-1])
					right[k2++] = a[i];
			}
			/*for(int i=0;i<k1;i++)
				System.out.print(left[i]+" ");
			System.out.println();
			for(int i=0;i<k2;i++)
				System.out.print(right[i]+" ");*/
			int flag1=0,flag2=0;
			for(int i=0;i<k1-1;i++)
			{
				if(left[i+1]<left[i])
				{
					flag1=1;
					break;
				}
			}
			for(int i=0;i<k2-1;i++)
			{
				if(right[i+1]>right[i])
				{
					flag2=1;
					break;
				}
			}
			if(flag1==0 && flag2==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
 
}
