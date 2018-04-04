    #include<stdio.h>
    int main()
    {
    			int t;
    			scanf("%d",&t);
    		while(t-->0)
    		{
    			int x;
    			int n;
    			scanf("%d %d",&x,&n);
    			int g1[n];
    			int g2[n];
    			int k1=0,k2=0;
    			long int s1=0,s2=0;
    			int fl=0,i;
    			for(i=n;i>=1;i--)
    			{
    				if(i!=x)
    				{
    					if(s1>s2)
    					{
    						g2[k2++]=i;
    						s2 = s2+i;
    					}
    					else
    					{
    						g1[k1++]=i;
    						s1 = s1+i;
    					}
    				}
    				
    			}
    			
    			//System.out.println(s1+" "+s2);
    			if((s1!=s2 && (s1+s2)%2!=0 )|| (s1==0)|| (s2==0) || (k1<1 || k2<1))
    			{
    				printf("impossible\n");
    				fl=1;
    			}
    			
    			if(fl==0)
    			{
    			if(s1==s2)
    			{
    				/*for(int i=0;i<k1;i++)
    					System.out.print(g1[i]+" ");
    				System.out.println();
    				for(int i=0;i<k2;i++)
    					System.out.print(g2[i]+" ");*/
    				char f[n];
    				for(i=0;i<n;i++)
    							f[i]='0';
    						f[i]='\0';
    				for(int i=0;i<n;i++)
    				{
    					if(i==x-1)
    						f[i]='2';
    					else
    						f[i]='0';
    				}
    				for(i=0;i<k1;i++)
    				{
    					
    					f[g1[i]-1]='1';
    				}
    				printf("%s\n",f);
    					
    			}
    			
    			
    				
    			
    			if(k1>k2 && s1!=s2 && (s1+s2)%2==0)
    			{
    				if(k1>1 && k2>1)
    				{
    					int temp=g2[k2-1];
    					g2[k2]=g1[k1-1];
    					g2[k2-1]=g1[k1-2];
    					g1[k1-2]=temp;
    					
    					long int S1=0,S2=0;
    					for(i=0;i<k1-1;i++)
    						S1=S1+g1[i];
    					for(i=0;i<=k2;i++)
    						S2=S2+g2[i];
    					
    					//System.out.println("\n"+S1+" "+S2);
    					if(S1==S2)
    					{
    						/*for(int i=0;i<k1-1;i++)
    							System.out.print(g1[i]+" ");
    						System.out.println();
    						for(int i=0;i<=k2;i++)
    							System.out.print(g2[i]+" ");*/
    						char f[n];
    						for(i=0;i<n;i++)
    							f[i]='0';
    						f[i]='\0';
    						for(i=0;i<n;i++)
    						{
    							if(i==x-1)
    								f[i]='2';
    							else
    								f[i]='0';
    						}
    						for(i=0;i<k1-1;i++)
    						{
    							
    							f[g1[i]-1]='1';
    						}
    						printf("%s\n",f);
    					}
    					else
    						printf("impossible\n");
    				}
    				else printf("impossible\n");
    				
    				
    			}
    			if(k2>k1 && s1!=s2 && (s1+s2)%2==0)
    			{
    				if(k1>1 && k2>1)
    				{
    					int temp=g1[k1-1];
    					g1[k1]=g2[k2-1];
    					g1[k1-1]=g2[k2-2];
    					g2[k2-2]=temp;
    					
    					long int S1=0,S2=0;
    					for(i=0;i<=k1;i++)
    						S1=S1+g1[i];
    					for(i=0;i<k2-1;i++)
    						S2=S2+g2[i];
    					
    					//System.out.println("\n"+S1+" "+S2);
    					if(S1==S2)
    					{
    						/*for(int i=0;i<=k1;i++)
    							System.out.print(g1[i]+" ");
    						System.out.println();
    						for(int i=0;i<k2-1;i++)
    							System.out.print(g2[i]+" ");*/
    						char f[n];
    						for(i=0;i<n;i++)
    							f[i]='0';
    						f[i]='\0';
    						for(i=0;i<n;i++)
    						{
    							if(i==x-1)
    								f[i]='2';
    							else
    								f[i]='0';
    						}
    						for(i=0;i<=k1;i++)
    						{
    							
    							f[g1[i]-1]='1';
    						}
    						printf("%s\n",f);
    					}
    					else printf("impossible\n");
    				}
    				
    				else
    					printf("impossible\n");
    			}
    			if(k1==k2 && s1!=s2 && (s1+s2)%2==0)
    			{
    				if(k1>1 && k2>1)
    				{
    					int temp = g1[k1-2];
    					g1[k1-2]=g2[k2-2];
    					g2[k2-2]=temp;
    					temp = g1[k1-1];
    					g1[k1-1]=g2[k2-1];
    					g2[k2-1]=temp;
    					
    					long int S1=0,S2=0;
    					for(i=0;i<k1;i++)
    						S1=S1+g1[i];
    					for(i=0;i<k2;i++)
    						S2=S2+g2[i];
    					
    					//System.out.println("\n"+S1+" "+S2);
    					if(S1==S2)
    					{
    						/*(int i=0;i<=k1;i++)
    							System.out.print(g1[i]+" ");
    						System.out.println();
    						for(int i=0;i<k2-1;i++)
    							System.out.print(g2[i]+" ");*/
    						char f[n];
    						for(i=0;i<n;i++)
    							f[i]='0';
    						f[i]='\0';
    						for(i=0;i<n;i++)
    						{
    							if(i==x-1)
    								f[i]='2';
    							else
    								f[i]='0';
    						}
    						for(i=0;i<k1;i++)
    						{
    							
    							f[g1[i]-1]='1';
    						}
    						printf("%s\n",f);
    					}
    					else printf("impossible\n");
    				}
    				
    				else
    					printf("impossible\n");
    				
    			}
    			
    			
    		}
    	}
     
    } 
