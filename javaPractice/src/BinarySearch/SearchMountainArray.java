package BinarySearch;

import java.util.Arrays;

public class SearchMountainArray {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,3,2,1};
		int target=3;
		int peak = findPeakElement(arr);
        int index = search(arr,target,0,peak);
        if(index == -1) 
            index = search(arr,target,peak, arr.length-1);
        
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("Index of Peak : "+ peak);
        System.out.println("Index of Target : "+ index);	
       }
	
    //RETURNS INDEX OF SEARCHED TARGET ELEMENT
    public static int search(int[] a, int target, int start, int end) {
        int mid;
        while(start<=end)
        {
            mid = start + (end-start)/2;
            if(a[mid]==target)
                return mid;
            else if(a[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    //RETURNS INDEX OF PEAK ELEMENT
    public static int findPeakElement(int[] a) {
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
		return start;	
    }

}
