package BinarySearch;

public class CeilFloor {

	public static void main(String[] args) {
		int a[]= {1,3,22,39,55,107,111,133};
		int t=1080;
		System.out.println("Ceil value: " + ceiling(a,t));
		System.out.println("Floor value: " + floor(a,t));
	}
	
	//returns largest element smalller than the number
	static int floor(int[] a, int t) 
	{
		//floor value does not exist if the target is smaller than smallest element
		if(t < a[0]) 
			return -1;
		
		int start=0,end=a.length-1;
		int mid;
		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(a[mid]==t)
				return a[mid];
			else if(a[mid]<t)
			{
				start=mid+1;
			}
			else 
			{
				end=mid-1;
			}
		}
		return a[end];
	}
	
	
	//returns smallest element larger than the number
	static int ceiling(int a[], int t)
	{
		//ceil value does not exist if the target is larger than largest element
		if(t > a[a.length-1]) 
			return -1;
		
		int start=0,end=a.length-1;
		int mid;
		while(start<=end)
		{
			mid=start+(end-start)/2;
			if(a[mid]==t)
				return a[mid];
			else if(a[mid]<t)
			{
				start=mid+1;
			}
			else 
			{
				end=mid-1;
			}
		}
		return a[start];
	}
	
	//BRUTE FORCE APPROACH
//	static int ceiling(int a[], int t)
//	{
//		//returns smallest element larger than the number
//		int c=0;
//		int start=0,end=a.length-1;
//		int mid;
//		for(int i=0;i<a.length;i++)
//		{
//			mid=start+(end-start)/2;
//			if(a[mid]==t)
//				return a[mid];
//			else if(a[mid]<t)
//			{
//				start=mid+1;
//				c=a[mid];
//			}
//			else 
//			{
//				end=mid-1;
//				c=a[mid];
//			}
//		}
//		return c;
//	}

}
