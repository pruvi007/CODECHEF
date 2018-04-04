import java.util.*;
 
public class CLANDLBL {
	public static int c=0;
	public static int gcd(int a, int b)
    {
        if (a == 0) 
            return b;
         
        return gcd(b%a,a);
    }
    // method to calculate all common divisors
    // of two given numbers
    // a, b --> input integer numbers
    public static int commDiv(int a,int b)
    {
        // find gcd of a,b
        int n = gcd(a, b);
      
        // Count divisors of n.
        int result = 0;
        for (int i=1; i<=Math.sqrt(n); i++)
        {
            // if 'i' is factor of n
            if (n%i==0)
            {
                // check if divisors are equal
                if (n/i == i)
                    result += 1;
                else
                    result += 2;
            }
        }
       // System.out.println(result);
        return result;
    }
	public static void heapPermutation(int a[], int size, int n,int A[][])
    {
        // if size becomes 1 then prints the obtained
        // permutation
        if (size == 1 )
        {
        	//for(int i=0;i<n;i++)
        		//System.out.print(a[i]+" ");
        	//System.out.println();
        	int flag=0;
        	for(int i=0;i<n;i++)
        	{
        		
        		for(int j=i;j<n;j++)
        		{
        			if(i==j)
        				continue;
        			int g = commDiv(a[i],a[j]);
        			
        				if(A[i][j]!=g)
        				{
        					flag=1;
        					break;
        				}
        					
        			
        			
        		}
        		if(flag==1)
        			break;
        		
        	}
        	if(flag==0 && c<1)
    		{
        		c++;
    			for(int i=0;i<n;i++)
    				System.out.println(a[i]);
    		}
        }
            
        
        for (int i=0; i<size; i++)
        {
            heapPermutation(a, size-1, n,A);
 
            // if size is odd, swap first and last
            // element
            if (size % 2 == 1)
            {
                int temp = a[0];
                a[0] = a[size-1];
                a[size-1] = temp;
            }
 
            // If size is even, swap ith and last
            // element
            else
            {
                int temp = a[i];
                a[i] = a[size-1];
                a[size-1] = temp;
            }
        
        }
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			c=0;
			int n = scan.nextInt();
			int a[][] = new int[n][n];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					a[i][j] = scan.nextInt();
				}
			}
			int b[] = new int[n];
			for(int i=0;i<n;i++)
				b[i] = i+1;
			
			heapPermutation(b,n,n,a);
		}
	}
 
}
