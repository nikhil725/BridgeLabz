import java.util.*;
public class Anagram{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first String");
		String str1 = in.nextLine();
		System.out.println("Enter Sceond String");
		String str2 = in.nextLine();
		String[] arr1 = "str1".split("");
		String[] arr2 = "str2".split("");
		int sizeOfArr1 = arr1.length;
		int sizeOfArr2 = arr2.length;
		System.out.println("The size : "+sizeOfArr1+", "+sizeOfArr2);
		if(sizeOfArr1 != sizeOfArr2)
		{
			System.out.println("Given strings are not Anagram");
		}
		else{
		String result1[] = sortArray(arr1, sizeOfArr1);
		String result2[] = sortArray(arr2, sizeOfArr2);
			for(int i=0; i< sizeOfArr1; i++)
			{
				if(result1[i] != result2[i])
				{
					System.out.println("Given strings are not Anagram");
				}
			}	
				System.out.println("Given String is Anagram");
		}
}
	public static String[] sortArray(String[] arr, int size)
	{
		
		for(int i=0; i<size; i++)
		{
			for(int j= 1; j<size; j++)
			{
				if(arr[j-1] . compareTo(arr[i]) > 0)
					{
					String temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}	
			}
		
		}
	return arr;
}
}
