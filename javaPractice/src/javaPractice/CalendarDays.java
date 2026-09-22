package javaPractice;

import java.util.Scanner;

public class CalendarDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date in YYYY-MM-DD:");
		String s=sc.next();
		System.out.println("Number of days:" + sum(s));
		sc.close();
	}

	static int sum(String s)
	{
		int year = Integer.parseInt(s.substring(0,4));
        int month = Integer.parseInt(s.substring(5,7));
        int date = Integer.parseInt(s.substring(8));
        int feb = 28;
        int sum = 0;
        if((year%4==0 && year%100!=0)||(year%400==0))
        {
            feb=29;
        }
        for(int i=1;i<month;i++)
        {
            if(i%2!=0 || i==8)
            {
                sum+=31;
            }
            else if(i>2)
                sum+=feb;
            else sum+=30;
        }
        return (sum+date);
        
	}
}
