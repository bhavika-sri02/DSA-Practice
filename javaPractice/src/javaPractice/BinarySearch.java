package javaPractice;

public class BinarySearch {

	public static void main(String[] args) {

		int[] a= {2,4,6,8,10,11,12,13,15};
		int t = 6;
		int index= binarySearch(a,t);
		if (index!= -1)
			System.out.print("Element found at index: "+index);
		else
			System.out.print("Element NOT found!!");
	}
	static int binarySearch(int[] a,int t )
	{
		int start=0,end=a.length-1;
		int mid;
		for (int i=0;i<a.length;i++)
		{
			mid=(start+end)/2;
			if(a[mid] == t)
				return mid;
			else if(a[mid]>t)
				end=mid-1;
			else
				start=mid+1;
		}
		return -1;
	}
}
