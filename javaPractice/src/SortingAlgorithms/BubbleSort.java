package SortingAlgorithms;

import java.util.Arrays;

//	Bubble Sort puts the largest element at the last in the first iteration and proceeds accordingly
// 	STABLE ALGORITHM
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {1,4,6,7,0,2,4,5,3,2,1};
		System.out.println("Original Array: "+Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));

	}

	static void bubbleSort(int[] arr) {
		int n=arr.length, temp;
		boolean swap = false;  // to save time if the array is sorted
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n-i-1;j++)
			{
				if(arr[j-1] > arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swap=true;
				}
			}
	        System.out.println(i);
			if(!swap)
				break;
		}
		
	}

}
