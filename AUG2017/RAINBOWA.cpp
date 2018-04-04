#include<iostream>
#include<cmath>
using namespace std;

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;

		
		int a[n];

		int f3=0;
		
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
			/*if(a[i]<1 || a[i]>7)
				f3=1;*/
		}

		int st[n];
		st[0] = a[0];
		int k=1;
		for(int i=1;i<n;i++)
		{
			if(st[k-1]!=a[i])
			{
				st[k++] = a[i];
			}
		}
		
		int f1=0;
		//cout<<k<<endl;

		/*for(int i=0;i<=k/2;i++)						//checking for 1234567 in tht order
			cout<<st[i]<<" ";*/
		//cout<<endl;
		for(int i=0;i<=k/2;i++)
		{
			if(st[i]!=(i+1))
			{
				f1=1;
				break;
			}
		}
		if(k!=13)
			f1=1;
		
		/*int f1=0,f2=0;
		for(int i=0;i<n/2;i++)
		{
			if(abs(a[i+1]-a[i])>1 || a[i+1]<a[i])
			{
				f1=1;
				break;
			}
		}*/

		int f2=0;
		for(int i=0;i<n;i++)							//checking for palindrome
		{
			if(a[i]!=a[n-i-1])
			{
				f2=1;
				break;
			}
		}

		if(n<13)										//checking the length
			f3=1;


		if(f1==0 && f2==0 && f3==0)
			cout<<"yes"<<endl;
		else
			cout<<"no"<<endl;
	}
}
