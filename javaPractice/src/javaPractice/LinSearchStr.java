package javaPractice;

public class LinSearchStr {
	public static void main(String[] args) {
		String s= "hello hi bye";
		char ch='b';
		
		System.out.println("String:\t"+ s);
		
		//int returnable function
		int index=linearSearch(s,ch);
		
		if(index==-1)
			System.out.println("Element not found!!");
		else
			System.out.println("Element found at index " + index);	
		
		//boolean returnable function
		if(linSearch2(s,ch))
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}
	
	static int linearSearch(String s,char ch)
	{
		if(s.length()==0)
			return -1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
				return i;
		}
		return -1;
	}
	
	static boolean linSearch2(String s,char ch)
	{
		for(char c:s.toCharArray())
		{
			if (c==ch)
			{
				return true;
			}
		}
		return false;
	}

}