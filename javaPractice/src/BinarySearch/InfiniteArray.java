package BinarySearch;

import java.util.Arrays;

public class InfiniteArray {

	public static void main(String[] args) {
		//TO FIND THE OCCURRENCE OF AN ELEMENT IN AND INFINITE ARRAY
		//infinite array means we cannot know the last index any how
		//so work on partition-based approach by doubling each time the element not found
		int a[]= {1,2,11,12,21,33,44,55,66,77,88,999};
		int target= 11;
		System.out.println("ARRAY:\t"+Arrays.toString(a));
		System.out.println("Target at index:\t"+ans(a,target));
	}
	static int ans(int a[],int target)
	{
		int start=0, end=1, index=-1, temp;
		while(a[end]<target)
		{
			temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;
			index=findIndex(a,target,start,end);
		}
		return index;
	}
	static int findIndex(int[] a, int t, int start, int end) {
		
		int mid;
		int index=-1;
		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(a[mid]==t)
			{
				return mid;
			}
			else if(a[mid]<t)
			{
				start=mid+1;
			}
			else 
			{
				end=mid-1;
			}
		}
		return index;
	}

}
