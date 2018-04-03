import java.util.*;
 
public class CHEFSUM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int n = scan.nextInt();
			int a[] = new int[n];
			long sum = 0;
			for(int i=0;i<n;i++)
			{
				a[i] = scan.nextInt();
				sum = sum+a[i];
			}
			long sum2=0;
			int k=0;
			long min[] = new long[n];
			sum2 =a[0];
			min[k++]=sum+sum2;
			long temp=0;
			for(int i=1;i<n;i++)
			{
				sum2 = sum2+a[i];
				temp = temp + a[i-1];
				min[k++] = sum2+(sum-temp);
				
			}
			long minf = min[0];
			int ind=0;
			for(int i=n-1;i>=0;i--)
			{
				
				if(min[i]<=minf)
				{
					minf = min[i];
					ind = i;
				}
			}
			
			System.out.println(ind+1);
		}
	}
 
}
