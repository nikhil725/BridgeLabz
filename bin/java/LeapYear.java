import java.util.*;
public class LeapYear{
	public static void main(String[] args){

	Scanner in =  new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = in.nextInt();
	
	if(num % 4 == 0)
		{
			System.out.println(num+" is a leap year");
		}else{
			System.out.println(num+" is a not leap year");
			}
		}
	}
