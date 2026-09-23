package javaPractice;

public class CeilFloor {

	public static void main(String[] args) {
		int a[]= {1,3,22,39,55,107,111,133};
		int t=108;
		int ceil=ceiling(a,t);
		System.out.println("Ceiling value: "+ceil);

	}
	static int ceiling(int a[], int t)
	{
		//returns smallest element larger than the number
		int c=0;
		int start=0,end=a.length-1;
		int mid;
		for(int i=0;i<a.length;i++)
		{
			mid=start+(end-start)/2;
			if(a[mid]==t)
				return a[mid];
			else if(a[mid]<t)
			{
				start=mid+1;
				c=a[mid];
			}
			else 
			{
				end=mid-1;
				c=a[mid];
			}
		}
		return c;
	}

}
