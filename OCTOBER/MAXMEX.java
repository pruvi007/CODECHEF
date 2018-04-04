 import java.util.*;
     
    public class MAXMEX {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int t = scan.nextInt();
    		while(t-->0)
    		{
    			int n = scan.nextInt();
    			int k = scan.nextInt();
    			int a[] = new int[n];
    			for(int i=0;i<n;i++)
    				a[i] = scan.nextInt();
    			Arrays.sort(a);
    			int a2[] = new int[n];
    			a2[0] = a[0];
    			int z=1;
    			for(int i=1;i<n;i++)
    			{
    				if(a2[z-1]!=a[i])
    				{
    					a2[z++] = a[i];
    				}
    					
    			}
    			
    			int flag1=0;
    			if(k==0)
    			{
    				for(int i=0;;i++)
    				{
    					if(i==z)
    						break;
    					if(i!=a2[i])
    					{
    						System.out.println(i);
    						flag1=1;
    						break;
    					}
    				}
    				if(flag1==0)
    					System.out.println(a2[z-1]+1);
    				
    			}
    			else
    			{
    				int b[] = new int[k];
    				int l =0,l1=0;
    				int flag2=0;
    				for(int i=0;;i++)
    				{
    					if(l==k || l1==z)
    						break;
    					if(i!=a2[l1])
    					{
    						b[l++] = i;
    						if(i>a2[l1])
    							l1++;
    					}
    					else
    						l1++;
    						
    				}
    				int num = a2[z-1];
    				num++;
    				while(l<k)
    				{
    					b[l++]=num++;
    				}
    				
    				
    				int A[] = new int[z+k];
    				l=0;l1=0;int l2=0;
    				while(l2<z)
    				{
    					if(l==k || l2==z)
    						break;
    					if(a2[l2]>b[l])
    					{
    						A[l1++]=b[l];
    						l++;
    					}
    					else if(a2[l2]<b[l])
    					{
    						A[l1++] = a2[l2];
    						l2++;
    					}
    					else
    					{
    						A[l1++] = a2[l2];
    						l2++;
    						l++;
    					}
    				}
    				while(l2<z)
    					A[l1++]=a2[l2++];
    				while(l<k)
    					A[l1++] = b[l++];
    				for(int i=1;i<A.length;i++)
    				{
    					if(A[i]==0)
    					{
    						A[i] = A[i-1]+1;
    					}
    				}
    				
    				for(int i=0;;i++)
    				{
    					if(i==z+k)
    						break;
    					if(i!=A[i])
    					{
    						System.out.println(i);
    						flag2=1;
    						break;
    					}
    				}
    				if(flag2==0)
    					System.out.println(A[z+k-1]+1);
    			}
    		}
    	}
     
    }
     
