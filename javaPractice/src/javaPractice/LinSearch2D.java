package javaPractice;

import java.util.Arrays;

public class LinSearch2D {

	public static void main(String[] args) {
		int a[][]= {
				{1,2,3},
				{4,5,6,7},
				{8,9,10,11,12}
		};
		int t=11;
		int index[]=linSearch2D(a,t);
		System.out.println("Element found at index: "+Arrays.toString(index));
	}
	static int[] linSearch2D(int [][] a,int t)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]==t)
					return new int[]{i,j};
			}
		}
		return new int[]{-1,-1};
	}

}
