import java.util.*;
 
public class CHEFPDIG {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0)
		{
			String s = scan.next();
			int flag[] = new int[27];
			for(int i=0;i<s.length();i++)
			{
				flag[s.charAt(i)-'0']++;
			}
			String out="";
			if(flag[6]>0)
			{
				if(flag[5]>0)
					out = out +'A';
				if(flag[6]>1)
					out = out +'B';
				if(flag[7]>0)
					out = out +'C';
				if(flag[8]>0)
					out = out +'D';
				if(flag[9]>0)
					out = out +'E';
			}
			if(flag[7]>0)
			{
				if(flag[0]>0)
					out = out +'F';
				if(flag[1]>0)
					out = out +'G';
				if(flag[2]>0)
					out = out +'H';
				if(flag[3]>0)
					out = out +'I';
				if(flag[4]>0)
					out = out +'J';
				if(flag[5]>0)
					out = out +'K';
				if(flag[6]>0)
					out = out +'L';
				if(flag[7]>1)
					out = out +'M';
				if(flag[8]>0)
					out = out +'N';
				if(flag[9]>0)
					out = out +'O';
			}
			if(flag[8]>0)
			{
				if(flag[0]>0)
					out = out +'P';
				if(flag[1]>0)
					out = out +'Q';
				if(flag[2]>0)
					out = out +'R';
				if(flag[3]>0)
					out = out +'S';
				if(flag[4]>0)
					out = out +'T';
				if(flag[5]>0)
					out = out +'U';
				if(flag[6]>0)
					out = out +'V';
				if(flag[7]>0)
					out = out +'W';
				if(flag[8]>1)
					out = out +'X';
				if(flag[9]>0)
					out = out +'Y';
			}
			if(flag[9]>0)
			{
				if(flag[0]>0)
					out = out +'Z';
			}
			System.out.println(out);
		}
	}
 
}
