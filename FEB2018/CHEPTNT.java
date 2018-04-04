    import java.util.*;
     
    public class CHEPTNT {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int t = scan.nextInt();
    		while(t-->0)
    		{
    			long n = scan.nextInt();
    			long m = scan.nextInt();
    			long x = scan.nextInt();
    			long k = scan.nextInt();
    			String s = scan.next();
    			
    			long even = 0,odd = 0;
    			for(int i=0;i<s.length();i++)
    			{
    				if(s.charAt(i)=='E')
    					even++;
    			}
    			odd = k-even;
    			
    			for(int i=1;i<=m;i++)
    			{
    				
    				if(i%2==0 && even>0)
    				{
    					if(even-x>=0)
    					{
    						n = n-x;
    						even=even-x;
    					}
    					else if(even-x<0)
    					{
    						n=n-even;
    						even=0;
    					}
    				}
    				else if(i%2!=0 && odd>0)
    				{
    					if(odd-x>=0)
    					{
    						n = n-x;
    						odd=odd-x;
    					}
    					else if(odd-x<0)
    					{
    						n=n-odd;
    						odd=0;
    					}
    				}
    				
    			}
    			if(n<=0)
    				System.out.println("yes");
    			else
    				System.out.println("no");
    		}
    	}
     
    }
     
