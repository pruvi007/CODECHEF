#include<stdio.h>
#include<math.h>
long int M(long int n1,long int n2)
{
    if(n1>n2)
	return n1;
    else
	return n2;
 
}
 
double F(int n,long int a[],long int dyn[],double t)
{
    if(n==1)
    {
        return 2*a[0];
    }
    return M(F(n-1,a,dyn,t)+t,dyn[n])+a[n-1];
}
int main()
{
      int t;
      scanf("%d",&t);
      while(t--)
      {
            int n;
            scanf("%d",&n);
            long int a[n];
            int i;
            for(i=0;i<n;i++)
                scanf("%ld",&a[i]);
            long int c,d,s;
            scanf("%ld %ld %ld",&c,&d,&s);
            long int dyn[11][n];
            dyn[0][0] = a[0];
            int j;
            //dyn[0]=0;
            //dyn[1]=a[0];
            //double val = (d*1.0/(s*1.0));
            for(i=0;i<n;i++)
            {
                dyn[0][i] = dyn[0][i-1]+a[i];
            }
            for(i=1;i<10;i++)
            {
                dyn[i][0] = dyn[i-1][0] + a[0];
            }
            for(i=1;i<2;i++)
            {
                for(j=1;j<n;j++)
                {
                        dyn[i][j] = M(dyn[i-1][j],dyn[i][j-1]) + a[j];
                }
            }
            /*for(i=0;i<c;i++)
            {
                for(j=0;j<n;j++)
                    printf("%ld ",dyn[i][j]);
            }
            printf("\n");
            /*for(i=0;i<=n;i++)
                printf("%ld ",dyn[i]);*/
            double ans = (c-1)*((double)(dyn[1][n-1]) - (double)(dyn[0][n-1]));
 
            printf("%.9lf\n",ans);
 
      }
}
