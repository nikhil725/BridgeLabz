
import java.util.*;
public class Sqrt {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		double num=sc.nextDouble();
		if(num<=0)
		{
			System.out.println("try another number");
			System.exit(0);
			
		}
		double value=square(num);
		System.out.println(value);
	}
	public static double square(double c) {
		double t=c;
		double Epsilon=1E-15;
		while((Math.abs(t-c/t))>(Epsilon*t))
		{
			t=(t+(c/t))/2;
		}
		return t;
		
	}
}
