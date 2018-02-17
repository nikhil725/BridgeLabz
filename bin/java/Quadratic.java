import java.util.*;
public class Quadratic
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the value of a");
        int a = in.nextInt();
	System.out.println("Enter the value of b");
        int b = in.nextInt();
	System.out.println("Enter the value of c");
        int c = in.nextInt();
	System.out.println("a="+a+"b="+b+"c="+c);
        double temp = Math.sqrt(b * b - 4 * a * c);
        double r1 = (-b +  temp) / (2*a) ;
        double r2 = (-b -  temp) / (2*a) ;
        System.out.println("The roots of the Quadratic Equation "+a+"*x*x +"+b+"*x" +c+ "= 0\"  are "+r1+" or "+r2);
    }
}
