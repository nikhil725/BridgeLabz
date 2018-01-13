import java.util.*;
public class PowerOfTwo{
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = in.nextInt();
	int i=0;
	int power =1;
	while(i<=num){
	System.out.println("Power of 2^"+i+"=" +power);
	power = power*2;
	i++;
}
}
}
