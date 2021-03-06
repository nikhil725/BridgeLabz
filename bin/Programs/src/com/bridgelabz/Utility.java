package com.bridgelabz;

public class Utility {


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

	public static void insertionSort(String[] array)
	{
		String temp;
		for(int i = 1; i < array.length; i++) // ar[i] is element to insert
		{
			temp = array[i];
			int j = 0;
			for(j = i; j > 0; j--)
				if(temp.compareTo(array[j - 1]) < 0)
					array[j] = array[j - 1];
				else
					break;
			array[j] = temp;
		}
	}

	public static int binarySearch(String word, String arr[], int length){

		int temp=0;
		if(length <= temp){
			return -1;
		}
		if(length - temp == 1){

			return arr[temp].equals(word) ? temp : -1;
		}

		int pivot = (temp + length)/2;
		if(word.compareTo(arr[pivot]) < 0)
		{
			return binarySearch(word, arr,pivot);
		} 
		else if(word.compareTo(arr[pivot]) > 0) 
		{
			return binarySearch(word, arr,pivot);
		}
		return pivot;

	}
}


