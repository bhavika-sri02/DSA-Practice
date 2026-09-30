package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {1,4,6,7,0,2,4,5,3,2,1};
		System.out.println("Original Array: "+Arrays.toString(arr));
        selection(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));

	}

	static void selection(int[] arr) {
		int temp;
		int max;
		for(int i=0;i<arr.length;i++)
		{
			max=i;
			for(int j=0;j<=arr.length-i-1;j++)
			{
				if(arr[j] > arr[max])
				{
					max=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[max];
			arr[max]=temp;			
		}
	}

}
