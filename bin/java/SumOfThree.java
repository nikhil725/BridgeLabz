import java.util.*;
public class SumOfThree{
 
	public static void main(String[] args){
	int count = 0;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Array Size");
	int length = in.nextInt();
	int [] arr = new int [length];
	System.out.println("Enter the "+length+"  element in array");
	for(int i=0; i<length; i++){
	arr[i] =  in.nextInt();
	}
	System.out.println("***************** Triplet Pairs *****************");
	System.out.println();
	for(int i=0; i<length; i++)
	{
		for(int j=i+1; j<length; j++)
			{
				for(int k=j+1; k<length ;k++)
				{
					if((arr[i] + arr[j] + arr[k]) == 0){
						count++;
						System.out.println(arr[i]+", "+arr[j]+", "+arr[k]+" Count = "+count);
						}
				}
			}
	}
	
}

}
