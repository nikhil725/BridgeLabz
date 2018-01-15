import java.util.*;
public class CouponNumber{
	public static void main(String[] args){
	
	char[] chars= "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
	int max = 10000;
	int random = (int) (Math.random()*max);
	System.out.println(random);
	System.out.println(chars.length);
	StringBuffer sb = new StringBuffer();
	
	while(random>0){

	sb.append(chars[random % chars.length]);
	random /= chars.length;

	}
		String couponCode = sb.toString();
		System.out.println("Coupon Code: "+couponCode);

	}

}
