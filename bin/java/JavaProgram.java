import java.util.*;

public class JavaProgram
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string one");
		String s1=sc.nextLine();
		System.out.println("enter the string two");
		String s2=sc.nextLine();
			String arr1[] =s1.split(" ");
			String arr2[] =s2.split(" ");
		if(arr1.length!=arr2.length)
		{
			System.out.println("two strings are not anagrames");
		}
		else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			boolean status=Arrays.equals(arr1, arr2);
			if(status==true)
			{
				System.out.println("two strings are anagrames");
			}
			else {

				System.out.println("two strings are not anagrames");	
			}
		}
	}
}
