import java.util.*;
 
public class PERFCONT {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int n = scan.nextInt();
			int p = scan.nextInt();
			int a[] = new int[n];
			int c=0,h=0;
			for(int i=0;i<n;i++)
			{
				a[i] = scan.nextInt();
				if(a[i]<=p/10 && a[i]<p/2)
					h++;
				else if(a[i]>=p/2)
					c++;
			}
			if(h==2 && c==1)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
 
}
