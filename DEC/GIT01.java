import java.util.*;
     
    public class GIT01 {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int t = scan.nextInt();
    		while(t-->0)
    		{
    			int n = scan.nextInt();
    			int m = scan.nextInt();
    			String s[] = new String[n];
    			StringBuilder p1 = new StringBuilder("");
    			for(int i=0;i<m;i++)
    			{
    				if(i%2==0)
    					p1 = p1.append('R');
    				else
    					p1 = p1.append('G');
    			}
    			StringBuilder p2 = new StringBuilder("");
    			for(int i=0;i<m;i++)
    			{
    				if(i%2==0)
    					p2 = p2.append('G');
    				else
    					p2 = p2.append('R');
    			}
    			//System.out.println(p1);
    			//System.out.println(p2);
    			for(int i=0;i<n;i++)
    			{
    				s[i] = scan.next();
    			}
    			int sum1=0,sum2=0;
    			for(int i=0;i<n;i++)
    			{
    				if(i%2==0)
    				{
    					for(int j=0;j<m;j++)
    					{
    						if(s[i].charAt(j)!=p1.charAt(j))
    						{
    							if(s[i].charAt(j)=='R')
    								sum1 = sum1 + 5;
    							else
    								sum1 = sum1 + 3;
    						}
    					}
    				}
    				else
    				{
    					for(int j=0;j<m;j++)
    					{
    						if(s[i].charAt(j)!=p2.charAt(j))
    						{
    							if(s[i].charAt(j)=='R')
    								sum1 = sum1 + 5;
    							else
    								sum1 = sum1 + 3;
    						}
    					}
    				}
    			
    			}
    			
    			for(int i=0;i<n;i++)
    			{
    				if(i%2==0)
    				{
    					for(int j=0;j<m;j++)
    					{
    						if(s[i].charAt(j)!=p2.charAt(j))
    						{
    							if(s[i].charAt(j)=='R')
    								sum2 = sum2 + 5;
    							else
    								sum2 = sum2 + 3;
    						}
    					}
    				}
    				else
    				{
    					for(int j=0;j<m;j++)
    					{
    						if(s[i].charAt(j)!=p1.charAt(j))
    						{
    							if(s[i].charAt(j)=='R')
    								sum2 = sum2 + 5;
    							else
    								sum2 = sum2 + 3;
    						}
    					}
    				}
    			
    			}
    			int ans = sum1>sum2?sum2:sum1;
    			System.out.println(ans);
    		}
    	}
     
    }
     
