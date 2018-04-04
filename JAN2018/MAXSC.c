    #include<stdio.h>
    int main()
    {
        int t;
        scanf("%d",&t);
        while(t--)
        {
        int n;
        scanf("%d",&n);
        int i,j,k=0;
        int a[n][n],max=0,max1,flag=0;
        long int sum=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                scanf("%d",&a[i][j]);
            }
        }
            for(i=0;i<n;i++)
            {
                if(a[n-1][i]>max)
                {
                    max=a[n-1][i];
                }
            }
    		sum = max;
    		max1=0;
            for(i=n-2;i>=0;i--)
            {
    			max1=0;
    			for(j=0;j<n;j++)
    			{
    					if(a[i][j]<max)
    					{
    						if(a[i][j]>max1)
    						{
    							max1=a[i][j];
    						}
    					}
    			}
                if(max1==max)
                {
                    flag=1;
                    break;
                }
    			else
    			{
                    sum=sum+max1;
    				max=max1;
    			}	
            }
            if(flag==1)
            {
                printf("-1\n");
            }
            else
            {
                printf("%ld\n",sum);
            }
    }
    } 
