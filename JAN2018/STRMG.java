import java.util.*;
 
public class STRMG {
	public static int lcs( char[] X, char[] Y, int m, int n )
	  {
	    int L[][] = new int[m+1][n+1];
	 
	    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
	         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
	    for (int i=0; i<=m; i++)
	    {
	      for (int j=0; j<=n; j++)
	      {
	        if (i == 0 || j == 0)
	            L[i][j] = 0;
	        else if (X[i-1] == Y[j-1])
	            L[i][j] = L[i-1][j-1] + 1;
	        else
	            L[i][j] = max(L[i-1][j], L[i][j-1]);
	      }
	    }
	  return L[m][n];
	  }
	 
	  /* Utility function to get max of 2 integers */
	 public static int max(int a, int b)
	  {
	    return (a > b)? a : b;
	  }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int n = scan.nextInt();
			int m = scan.nextInt();
			String a = scan.next();
			String b = scan.next();
			
			
			
			char x[] = a.toCharArray();
			char y[] = b.toCharArray();
			//int l =lcs(x,y,n,m);
			//System.out.println(l);
			
			//Arrays.sort(x);
			//Arrays.sort(y);
			String f1 = ""+x[0];
			
			int k1=0;
			for(int i=1;i<x.length;i++)
			{
				if(x[i]!=f1.charAt(k1))
				{
					f1=f1+x[i];
					k1++;
				}
			}
			
			String f2 = ""+y[0];
			int k2=0;
			for(int i=1;i<y.length;i++)
			{
				if(y[i]!=f2.charAt(k2))
				{
					f2=f2+y[i];
					k2++;
				}
			}
			char x1[] = f1.toCharArray();
			char x2[] = f2.toCharArray();
			int l = lcs(x1,x2,x1.length,x2.length);
			//System.out.println(f1);
			//System.out.println(f2);
			System.out.println(x1.length+x2.length-l);
		}
	}
 
}
