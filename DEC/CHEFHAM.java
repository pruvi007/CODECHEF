import java.util.*;
 
public class CHEFHAM {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			int n = scan.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int c[] = new int[100001];
			int d[] = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]= scan.nextInt();
				c[a[i]]++;
				b[i] = a[i];
				d[i] = a[i];
			}
			int flag=0;
			for(int i=1;i<=100000;i++)
			{
				if(c[i]>1)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				if(n%2==0)
				{
					for(int i=0;i<n;i+=2)
					{
						int temp = a[i];
						a[i] = a[i+1];
						a[i+1]=temp;
					}
					int hd = 0;
					for(int i=0;i<n;i++)
					{
						if(a[i]!=b[i])
							hd++;
					}
					System.out.println(hd);
					for(int i=0;i<n;i++)
					{
						System.out.print(a[i]+" ");
					}
					System.out.println();
				}
				else
				{
					if(n==1)
					{
						System.out.println("0");
						System.out.println(a[0]);
					}
					else
					{
						for(int i=0;i<n-1;i+=2)
						{
							int temp = a[i];
							a[i] = a[i+1];
							a[i+1]=temp;
						}
						int temp = a[n-1];
						a[n-1] = a[n-2];
						a[n-2]=temp;
						int hd = 0;
						for(int i=0;i<n;i++)
						{
							if(a[i]!=b[i])
								hd++;
						}
						System.out.println(hd);
						for(int i=0;i<n;i++)
						{
							System.out.print(a[i]+" ");
						}
						System.out.println();
					}
					
				}
			}
			else
			{
				
				if(n%2==0)
				{
					if(n>2)
					{
						int ind[] = new int[n];
						int k=0;
						for(int i=0;i<n-1;i++)
						{
							if(a[i]==a[i+1])
							{
								ind[k++]=i+1;
							}
						}
						/*System.out.print("indexs: ");
						for(int i=0;i<k;i++)
							System.out.print(ind[i]+" ");
						System.out.println();*/
						for(int i=0;i<k-1;i++)
						{
							int temp = a[ind[i]];
							a[ind[i]] = a[ind[i+1]];
							a[ind[i+1]] = temp;
							int temp2 = a[ind[i]-1];
							a[ind[i]-1] = a[ind[i+1]-1];
							a[ind[i+1]-1] = temp2;
							
						}
						for(int i=0;i<n;i+=2)
						{
							int temp = a[i];
							a[i] = a[i+1];
							a[i+1]=temp;
						}
						int f[] = new int[n];
						for(int i=0;i<n;i++)
							f[i] = a[i];
						for(int i=0;i<n-2;i++)
						{
							int temp = f[i];
							f[i] = f[i+2];
							f[i+2] = temp;
						}
						int hd1 = 0;
						for(int i=0;i<n;i++)
						{
							if(f[i]!=b[i])
								hd1++;
						}
						int hd = 0;
						for(int i=0;i<n;i++)
						{
							if(a[i]!=b[i])
								hd++;
						}
						for(int i=0;i<n-2;i++)
						{
							int temp = d[i];
							d[i] = d[i+2];
							d[i+2] = temp;
						}
						int hd2 = 0;
						for(int i=0;i<n;i++)
						{
							if(d[i]!=b[i])
								hd2++;
						}
						
						int max = hd>hd1?(hd>hd2?hd:hd2):(hd1>hd2?hd1:hd2);
						if(max == hd)
						{
							System.out.println(hd);
							for(int i=0;i<n;i++)
								System.out.print(a[i]+" ");
							System.out.println();
						}
						else if(max == hd1)
						{
							System.out.println(hd1);
							for(int i=0;i<n;i++)
								System.out.print(f[i]+" ");
							System.out.println();
						}
						else if(max == hd2)
						{
							System.out.println(hd2);
							for(int i=0;i<n;i++)
								System.out.print(d[i]+" ");
							System.out.println();
						}
						
						
						
					}
					else
					{
						System.out.println("0");
						System.out.println(b[0]+" "+b[1]);
					}	
					
				}
				
				else
				{
					if(n==1)
					{
						System.out.println("0");
						System.out.println(a[0]);
					}
					else
					{
						for(int i=0;i<n-2;i++)
						{
							int temp = d[i];
							d[i] = d[i+2];
							d[i+2] = temp;
						}
						int hd2 = 0;
						for(int i=0;i<n;i++)
						{
							if(d[i]!=b[i])
								hd2++;
						}
						int ind[] = new int[n];
						int k=0;
						for(int i=0;i<n-1;i++)
						{
							if(a[i]==a[i+1])
							{
								ind[k++]=i+1;
							}
						}
						/*System.out.print("indexes: ");
						for(int i=0;i<k;i++)
							System.out.print(ind[i]+" ");
						System.out.println();*/
						for(int i=0;i<k-1;i++)
						{
							int temp = a[ind[i]];
							a[ind[i]] = a[ind[i+1]];
							a[ind[i+1]] = temp;
							int temp2 = a[ind[i]-1];
							a[ind[i]-1] = a[ind[i+1]-1];
							a[ind[i+1]-1] = temp2;
							
						}
						for(int i=0;i<n-1;i+=2)
						{
							int temp = a[i];
							a[i] = a[i+1];
							a[i+1]=temp;
						}
						int temp = a[n-1];
						a[n-1] = a[n-2];
						a[n-2] = temp;
						
						int hd = 0;
						
						for(int i=0;i<n;i++)
						{
							if(a[i]!=b[i])
								hd++;
						}
						int f[] = new int[n];
						for(int i=0;i<n;i++)
							f[i] = a[i];
						for(int i=0;i<n-3;i++)
						{
							temp = f[i];
							f[i] = f[i+2];
							f[i+2] = temp;
						}
						int hd1 = 0;
						for(int i=0;i<n;i++)
						{
							if(f[i]!=b[i])
								hd1++;
						}
						int max = hd>hd1?(hd>hd2?hd:hd2):(hd1>hd2?hd1:hd2);
						if(max == hd)
						{
							System.out.println(hd);
							for(int i=0;i<n;i++)
								System.out.print(a[i]+" ");
							System.out.println();
						}
						else if(max == hd1)
						{
							System.out.println(hd1);
							for(int i=0;i<n;i++)
								System.out.print(f[i]+" ");
							System.out.println();
						}
						else if(max == hd2)
						{
							System.out.println(hd2);
							for(int i=0;i<n;i++)
								System.out.print(d[i]+" ");
							System.out.println();
						}
						
					}
				}
			}
		}
	}
 
}
