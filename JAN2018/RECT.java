import java.util.*;
 
public class RECT {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int a[] = new int[4];
			int c[] = new int[10001];
			for(int i=0;i<4;i++)
			{
				a[i] = scan.nextInt();
				c[a[i]]++;
			}
			int f1=0,f2=0;
			for(int i=0;i<10001;i++)
			{
				if(c[i]!=0)
				{
					if(c[i]==2)
						f1++;
					if(c[i]==4)
						f2++;
				}
			}
			if(f1==2 && f2==0)
				System.out.println("YES");
			else if(f1==0 && f2==1)
				System.out.println("YES");
			else System.out.println("NO");
		}
	}
 
}
