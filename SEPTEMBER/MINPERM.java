import java.util.*;
 
public class MINPERM {
	public static void swap(int ar[],int a,int b)
	{
		int temp = ar[a];
		ar[a] = ar[b];
		ar[b]=temp;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int n = scan.nextInt();
			int a[] = new int[n+1];
			for(int i=1;i<=n;i++)
				a[i] = i;
			if(n%2==0)
			{
				for(int i=1;i<=n;i+=2)
				{
					swap(a,i,i+1);
				}
				for(int i=1;i<=n;i++)
					System.out.print(a[i]+" ");
				
			}
				
			else
			{
				for(int i=1;i<n;i+=2)
				{
					swap(a,i,i+1);
				}
				swap(a,n,n-1);
				for(int i=1;i<=n;i++)
					System.out.print(a[i]+" ");
			}
				
			
			
		}
		
		
	}
 
}
