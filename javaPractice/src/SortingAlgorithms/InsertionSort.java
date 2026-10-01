package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {1,4,6,7,0,2,4,5,3,2,1};
		System.out.println("Original Array: "+Arrays.toString(arr));
        insertion(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));

	}
	 static void insertion(int arr[])
	    {
	        int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;          
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	    }


}
