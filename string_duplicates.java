import java.util.Scanner;

public class string_duplicates 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		
		for(int i=0;i<sb.length();i++)
		{
			if(sb.indexOf(String.valueOf(sb.charAt(i)))!=sb.lastIndexOf(String.valueOf(sb.charAt(i))))
			{
				sb.deleteCharAt(sb.lastIndexOf(String.valueOf(sb.charAt(i))));
				i--;
			}
		}

		System.out.println(sb.toString());
	}

}
