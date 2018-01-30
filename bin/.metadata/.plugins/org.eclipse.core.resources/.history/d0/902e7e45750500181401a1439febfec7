package com.bridgelabz.algorithmprograms;

public class Utility {


	/** This method insertion sort for integer.
	 * @param arr
	 */
	public static void insertionSortforInt(int arr[]){
		int leng = arr.length;
		for (int i=1; i<leng; ++i)
		{
			int key = arr[i];
			int j = i-1;

			while (j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	/** This method binary search for integer.
	 * @param arr
	 * @param key
	 * @param size
	 * @return
	 */
	public static int binarySearchforInt(int arr[], int key,int size){

		int first = 0;
		int last = size - 1;
		int middle = (first + last)/2;

		while( first <= last )
		{
			if ( arr[middle] < key ){

				first = middle + 1;
			}

			else if ( arr[middle] == key )
			{
				return middle;
			}
			else 
			{
				last = middle - 1;
			}
			middle = (first + last)/2;
		}
		if ( first > last )
			return -1;
		return middle;

	}

	/** This method for bubble sort integer.
	 * @param arr
	 */
	public static void bubbleSort(int arr[]){

		int length = arr.length;


		for(int i=0; i<length; i++){

			for(int j=0; j<length-1; j++ ){

				if (arr[j] > arr[j+1])
				{
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
		}

	}

	/** This method for bubble sort string
	 * @param arr
	 */
	public static void bubbleSort(String arr[]){
		String temp;

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {


				if(arr[j].compareTo(arr[j+1])>=0) {

					temp = arr[j];

					arr[j] = arr[j+1];

					arr[j+1] = temp;
				}

			}

		}
	}

	/** This method is used to sort the array using insertion sort method.
	 * @param array
	 */
	public static void insertionSort(String[] array)
	{
		String temp;
		for(int i = 1; i < array.length; i++)
		{
			temp = array[i];
			int j = 0;
			for(j = i; j > 0; j--)
				
				if(temp.compareTo(array[j - 1]) < 0){
					 
					array[j] = array[j - 1];
				}
				else{
					
				
					break;
				}		
				
					
			array[j] = temp;
			
		}
	}


	
}

