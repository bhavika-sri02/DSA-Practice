package javaPractice;

import java.util.Arrays;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int target=2;
		
		System.out.println("Array:\t"+ Arrays.toString(a));
		
		int index=linearSearch(a,target);
		
		if(index==-1)
			System.out.println("Element not found!!");
		else
			System.out.println("Element found at index " + index);		
	}
	
	static int linearSearch(int [] a,int t)
	{
		if(a.length==0)
			return -1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==t)
				return i;
		}
		return -1;
	}

}
