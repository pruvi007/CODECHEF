    import java.util.*;
     
    public class VK18 {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int val[] = new int[2000001];
    		for(int i=1;i<=2000000;i++)
    		{
    			int e = 0,o=0;
    			int num = i;
    			while(num>0)
    			{
    				int rem = num%10;
    				if(rem%2==0)
    					e = e+rem;
    				else
    					o = o +rem;
    				num = num/10;
    			}
    			val[i] = Math.abs(e-o);
    		}
    		long ss[] = new long[2000001];
    		ss[0] = val[0];
    		for(int i=1;i<=2000000;i++)
    		{
    			ss[i] = val[i] + ss[i-1];
    		}
    		/*for(int i=1;i<=10;i++)
    			System.out.print(val[i]+" ");
    		System.out.println();
    		for(int i=1;i<=10;i++)
    			System.out.print(ss[i]+" ");*/
    		long pre[] = new long[1000001];
    		long d = 0;
    		int x =2;
    		
    		pre[1]=2;
    		pre[2]=12;
    		for(int i=3;i<=1000000;i++)
    		{
    			long sum = 0;
    			sum = ss[2*i-1]-ss[i];
    			pre[i] = pre[i-1]+ 2*sum + val[2*i];
    		}
    		int t = scan.nextInt();
    		while(t-->0)
    		{
    			int n = scan.nextInt();
    			System.out.println(pre[n]);
    			/*long d = 0;
    			int x =2;
    			int m = n-1;
    			if(n==1)
    				System.out.println("2");
    			else
    			{
    				for(int i=1;i<=2*n-1;i++)
    				{
    					int num = x;
    					int e = 0,o=0;
    					while(num>0)
    					{
    						int rem = num%10;
    						if(rem%2==0)
    							e = e+rem;
    						else
    							o = o +rem;
    						num = num/10;
    					}
    					if(i<=n)
    						d = d + i*Math.abs(e-o);
    					else
    					{
    						d = d + m*Math.abs(e-o);
    						m--;
    					}	
    					x++;
    				
    				}
    				System.out.println(d);
    			}*/
    			
    		}
    	}
     
    } 
