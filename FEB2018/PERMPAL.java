import java.util.*;
 
public class PERMPAL {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			String s = scan.next();
			ArrayList<Integer> c[] = new ArrayList[26];
			for(int i=0;i<26;i++)
				c[i] = new ArrayList<Integer>();
			int a[] = new int[26];
			for(int i=0;i<s.length();i++)
			{
				a[s.charAt(i)%97]++;
			}
			int odd=0;
			for(int i=0;i<26;i++)
			{
				/*if(a[i]>0)
				{
					char ch = (char)(97+i);
					System.out.println(ch+" "+a[i]);
				}*/
				if(a[i]%2!=0)
					odd++;
					
					
			}
			if(odd>1)
				System.out.println("-1");
			else
			{
				for(int i=0;i<s.length();i++)
				{
					c[s.charAt(i)%97].add(i);
				}
				int pos[] = new int[s.length()];
				int k=0;
				for(int i=0;i<26;i++)
				{
					//char ch = (char)(97+i);
					if(c[i].size()>0 && c[i].size()%2==0)
					{
						//System.out.print(ch+" ");
						for(int j=0;j<c[i].size()/2;j++)
						{
							pos[k++]=c[i].get(j)+1;
							//System.out.print(c[i].get(j)+" ");
						}
							
						//System.out.println();
					}
					
				}
				for(int i=0;i<26;i++)
				{
					//char ch = (char)(97+i);
					if(c[i].size()>0 && c[i].size()%2!=0)
					{
						//System.out.print(ch+" ");
						for(int j=0;j<c[i].size();j++)
						{
							pos[k++]=c[i].get(j)+1;
							//System.out.print(c[i].get(j)+" ");
						}
							
						//System.out.println();
					}
					
				}
				int K = s.length()-1;
				for(int i=0;i<26;i++)
				{
					//char ch = (char)(97+i);
					if(c[i].size()>0 && c[i].size()%2==0)
					{
						//System.out.print(ch+" ");
						for(int j=c[i].size()-1;j>=c[i].size()/2;j--)
						{
							pos[K--]=c[i].get(j)+1;
							//System.out.print(c[i].get(j)+" ");
						}
							
						//System.out.println();
					}
					
				}
				for(int i=0;i<s.length();i++)
					System.out.print(pos[i]+" ");
				System.out.println();
				
			}
				
		}
	}
 
}
