package com.bridgelabz;

public class Prime {

	public static void main(String[] args) {
		
        int count = 0;
        for(int i=1;i<1000;i++)
        {
            count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(i);
            }
        }

	}

}
