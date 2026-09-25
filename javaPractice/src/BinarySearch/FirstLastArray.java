package BinarySearch;

import java.util.Arrays;

//To retrun the first and last occurrence of and element in the given array
public class FirstLastArray {

	public static void main(String[] args) {
		int a[]= {1,1,1,1,111,133};
		int target= 111;
		int pos[]= {-1,-1};
		pos[0]=findIndex(a,target,true);
		pos[1]=findIndex(a,target,false);
		System.out.println(Arrays.toString(pos));
	}
	
	static int findIndex(int[] a, int t, boolean first) {
		int start=0,end=a.length-1;
		int mid;
		int index=-1;
		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(a[mid]==t)
			{
				index=mid;
				if(first)
					end=mid-1;
				else
					start=mid+1;
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