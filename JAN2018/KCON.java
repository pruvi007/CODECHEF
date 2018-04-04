    import java.util.*;
     
    public class KCON{
    	
    	public static long maxSubArraySum(long[] m)
        {
            int size = m.length;
            long max_so_far = m[0], max_ending_here = 0;
     
            for (int i = 0; i < size; i++)
            {
                max_ending_here = max_ending_here + m[i];
                if (max_so_far < max_ending_here)
                    max_so_far = max_ending_here;
                if (max_ending_here < 0)
                    max_ending_here = 0;
            }
            return max_so_far;
        }
    	/*public  static long maxCircularSum (long[] a)
        {
            int n = a.length;
     
            // Case 1: get the maximum sum using standard kadane'
            // s algorithm
            long max_kadane = maxSubArraySum(a);
            
            // Case 2: Now find the maximum sum that includes
            // corner elements.
            long max_wrap  =  0;
            for (int i = 0; i < n; i++)
            {
                max_wrap += a[i]; // Calculate array-sum
                a[i]=-a[i];  // invert the array (change sign)
            }
     
            // max sum with corner elements will be:
            // array-sum - (-max subarray sum of inverted array)
            max_wrap = max_wrap + maxSubArraySum(a);
     
            // The maximum circular sum will be maximum of two sums
            return (max_wrap > max_kadane)? max_wrap: max_kadane;
        }*/
    	
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int t = scan.nextInt();
    		while(t-->0)
    		{
    			int n = scan.nextInt();
    			int k = scan.nextInt();
    			long a[] = new long[n];
    			for(int i=0;i<n;i++)
    				a[i] = scan.nextLong();
    	
    			
    				if(k==1)
    				{
    					
    					long sum = maxSubArraySum(a);
    					System.out.println(sum);
    				}
    				else
    				{
    					
    					long s1 = maxSubArraySum(a);
    					long b[] = new long[n*2];
    					for(int i=0;i<n*2;i++)
    						b[i] = a[i%n];
    					long s2 = maxSubArraySum(b);
    					//System.out.println("s1 "+s1+" s2 "+s2);
    						long pos=0,ne=0;
    						for(int i=0;i<n;i++)
    						{
    							if(a[i]>=0)
    								pos = pos+a[i];
    							else
    								ne = ne + a[i];
    						}
    						
    						ne = Math.abs(ne);
    						//System.out.println(pos+" "+ne);
    						if(pos>ne)
    						{
    							long a1 = pos-ne;
    							long b1 = s2-s1;
    							//System.out.println(a1+" "+b1);
    							if(a1==b1)
    							{
    								long ans = s1 + ((k-1)*(pos-ne));	
    								System.out.println(ans);
    							}
    							else
    							{
    								long ans = s1 +(k-1)*(pos-ne);
    								ans  = ans + Math.abs(a1-b1);
    								System.out.println(ans);
    							}
    							
    						}
    						else
    						{		
    							System.out.println(s2);
    							
    							
    						}
    					
    					
    					
    				
    			}
    			
    		}
    		
    	}
     
    }
     
