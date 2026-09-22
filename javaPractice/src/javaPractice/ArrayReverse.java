package javaPractice;
import java.util.*;

public class ArrayReverse {
	
	public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			int arr[]= {1,2,4,5,6};
			System.out.println(Arrays.toString(arr));
			reverse(arr);
			System.out.println(Arrays.toString(arr));
			
			System.out.println("\nWORKING WITH ARRAY LIST:\n");
			
			ArrayList <Integer> A= new ArrayList<>(5);
			for (int i=100;i<=105;i++) A.add(i);
			System.out.println(A);
			reverseList(A);
			System.out.println(A);

			sc.close();
	}
	
	//REVERSING THE ARRAY
	static void reverse(int arr[])
	{
		int len=arr.length;
		int start=0,end=len-1, temp;
		for(int i=0;i<len/2;i++)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
	
	//REVERSING ARRAY LIST
	static void reverseList(ArrayList<Integer> arr)
	{
		int len=arr.size();
		int start=0,end=len-1, temp;
		for(int i=0;i<len/2;i++)
		{
			temp=arr.get(start);
			arr.set(start,arr.get(end));
			arr.set(end,temp);
		}
	}
}
