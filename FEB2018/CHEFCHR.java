import java.util.*;
 
public class CHEFCHR {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int c=0;
			String s = scan.next();
			
			for(int i=0;i<s.length()-3;i++)
			{
				int a[] = new int[26];
				for(int j=i;j<i+4;j++)
				{
					a[s.charAt(j)%97]++;
				}
				
				//System.out.println(a[2]+" "+a[4]+" "+a[5]+" "+a[7]);
				if(a[2]>0 && a[4]>0 && a[5]>0 && a[7]>0)
					c++;
				
			}
			if(c==0)
				System.out.println("normal");
			else
				System.out.println("lovely "+c);
			
		}
	}
 
}
