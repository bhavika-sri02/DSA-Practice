package javaPractice;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Hellow BHAVIKA!!!");
		int a[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		//NEW WAY TO ITERATE OVER ARRAY
		for(int i[] :a)
		{
			System.out.println(Arrays.toString(i));
		}
		
		String[] s= {"hi","bye","tata","Tschuss","aufwiedersehn"};
		for(String i :s)
		{
			System.out.println(i);
		}
	}

}
