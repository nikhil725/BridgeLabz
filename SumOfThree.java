import java.util.*;
public class SumOfThree{
 
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Array Size");
	int length = in.nextInt();
	int [] arr = new int [length];
	System.out.println("Enter the "+length+"  element in array");
	for(int i=0; i<length; i++){
	arr[i] =  in.nextInt();

	}
	System.out.println("The Element in array is ");	
	for(int num : arr){
	System.out.println(num);

	}
	
}

}
