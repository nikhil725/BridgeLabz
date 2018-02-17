import java.util.*;
public class CouponNumber
{
	
	public static void main(String[] args)
	{
		 int count=0,distinct=0;
		int number, val = 0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Coupon numbers");
		number=scanner.nextInt();
		
		boolean[] value=new boolean[number];
		
		while(distinct<number)
		{
			 val = (int) (Math.random()*number);
			count++;
			if(!value[val])
			{
				distinct++;
				value[val]=true;
				System.out.println("The array is....."+val+" ");
			}
			
		}
		
	
		System.out.println("Total Random number to have Distinct Number... "+count);
	}

	private static int getCoupon(int n)
	{
		return (int)(Math.random()*n);

	}
}

