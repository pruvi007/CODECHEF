import java.util.*;
 
public class VILTRIBE {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			String s = scan.next();
			
			int cA=0,cB=0;
			int indA[] = new int[s.length()];
			int indB[] = new int[s.length()];
			int k1=0,k2=0;
			
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='A')
					indA[k1++] = i;
				else if(s.charAt(i)=='B')
					indB[k2++] = i;
			}
			/*for(int i =0;i<k1;i++)
				System.out.print(indA[i]+" ");
			System.out.println();
			for(int i=0;i<k2;i++)
				System.out.print(indB[i]+" ");*/
			int i1 = 0,i2=1;
			while(true)
			{
				if(i2>=k1)
					break;
				int j = indA[i1],j2 = indA[i2];
				int flag=0;
				while(j<j2)
				{
					if(s.charAt(j)=='B')
					{
						flag=1;
						break;
					}
					j++;
				}
				if(flag==0)
				{
					cA = cA + indA[i2]-indA[i1]-1;
				}
				i1=i2;i2++;
					
			}
			i1=0;i2=1;
			while(true)
			{
				if(i2>=k2)
					break;
				int j = indB[i1],j2 = indB[i2];
				int flag=0;
				while(j<j2)
				{
					if(s.charAt(j)=='A')
					{
						flag=1;
						break;
					}
					j++;
				}
				if(flag==0)
				{
					cB = cB + indB[i2]-indB[i1]-1;
				}
				i1=i2;i2++;
					
			}
			//System.out.println();
			System.out.println((cA+k1)+" "+(cB+k2));
		}
	}
 
}
