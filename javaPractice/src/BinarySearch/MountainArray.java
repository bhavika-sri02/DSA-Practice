package BinarySearch;

import java.util.Arrays;

//FIND PEAK ELEMENT IN THE MOUNTAIN ARRAY 
//ascending then descending

public class MountainArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,8,4,3,2};
		
		System.out.println("Array: "+Arrays.toString(a));
		System.out.println("Peak element: "+peak(a));
	}
	
	static int peak(int[] a) {
		int start=0,end=a.length-1;
		int mid;
		while(start<end)
		{
			mid=start+(end-start)/2;
			if(a[mid]<a[mid+1])
			{
				start=mid+1;
			}
			else
			{
				end=mid;
			}
		}
		//the loop breaks when start==end i.e. they both point to same element and that is the maximum element of array
		return a[start];
	}

}
