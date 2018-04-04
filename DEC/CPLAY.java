import java.util.*;
 
public class CPLAY {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			String s = scan.next();
			int a = 0,b = 0,ia=0,ib=0;
			char A[] = new char[10];
			char B[] = new char[10];
			int k1=0,k2=0;
			for(int i=0;i<20;i++)
			{
				if(i%2==0)
				{
					A[k1++] = s.charAt(i);
				}
				else 
				{
					B[k2++] = s.charAt(i);
				}
			}
			
			for(int i=0;i<5;i++)
			{
				if(A[i]=='1')
				{
					a++;
				}
				if(B[i]=='1')
				{
					b++;
					
				}
			}
			if(a==b)
			{
				int flag=0;
				for(int i=5;i<10;i++)
				{
					if(A[i]!=B[i])
					{
						flag=1;
						if(A[i]=='1')
						{
							System.out.println("TEAM-A "+(2*(i+1)));
						}
						if(B[i]=='1')
						{
							System.out.println("TEAM-B "+2*(i+1));
						}
						break;
					}
				}
				if(flag==0)
					System.out.println("TIE");
			}
			
			else
			{
				int l=0,p=0;
				a=0;b=0;
				for(int i=0;i<10;i++)
				{
					if(i%2==0)
					{
						if(A[l]=='1')
							a++;
						//System.out.println(a+" "+(5-p+b));
						l++;
						if(a>b && (a-b)>(10-i)/2)
						{
							System.out.println("TEAM-A "+(i+1));
							break;
						}
						if(b>a && (b-a)>(9-i)/2)
						{
							System.out.println("TEAM-B "+(i+1));
							break;
						}
						
					}
					else
					{
						if(B[p]=='1')
							b++;
						p++;
						if(b>a && (b-a)>(9-i)/2)
						{
							System.out.println("TEAM-B "+(i+1));
							break;
						}
						if(a>b && (a-b)>(10-i)/2)
						{
							System.out.println("TEAM-A "+(i+1));
							break;
						}
					
					}
				}
			}
			
			
			}
		/*10101111000000000000	
		  10101011000000000000	
		  01011101110000000000	
		  01101110100000000000	
		  10111111000000000000	
		  01011111000000000000 
		  TEAM-A 7
		  TEAM-A 6
		  TEAM-B 7
		  TEAM-A 9
		  TEAM-A 10
		  TEAM-B 8*/
	}
	
 
}
