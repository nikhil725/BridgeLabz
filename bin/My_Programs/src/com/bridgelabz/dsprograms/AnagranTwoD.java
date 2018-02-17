package com.bridgelabz.dsprograms;

public class AnagranTwoD {

	public static void main(String[] args) {
		
		int a[][]=new int[10][];
		int initial=1,temp=100;
		int i,j,k;
		int count=0;
		System.out.println("anagrames numbers are");
		for(i=0; i<10; i++)
		{
			
			for(j=initial; j<temp; j++)
			{
				boolean flag=true;
				for(k=2; k<j; k++)
				{
					if(j%k==0)
					{
						flag=false;
						break;
					}					
				}
				if(flag==true)
				{
					int rem,num=j,sum=0;
					while(num>0)
					{
						rem = num % 10;
						sum = (sum*10)+rem;
						num=num/10;
					}
					if(sum==j)        
					{
						count++;
					}
				}
			}
			
			a[i]=new int[count];
			j=0;
			int m;
			for(m=initial; m<temp; m++)
			{
				boolean temp1=true;
				for(int q=2; q<m; q++)
				{
					if(m%q==0)
					{
						temp1=false;
						break;
					}
				}
				if(temp1==true)
				{
					int rem,num=m,sum=0;
					while(num>0)
					{
						rem = num % 10;
						sum = (sum*10)+rem;
						num=num/10;
					}
					if(sum==m)
					{
						a[i][j]=m;
						System.out.print(a[i][j]+"\t");
						j++;
					}
				}
			}
			count++;
			
			System.out.println();
			initial=temp;
			temp=temp+100;
		}
	}
}
