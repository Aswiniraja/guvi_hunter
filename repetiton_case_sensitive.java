import java.util.Scanner;

public class repetiton_case_sensitive
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		StringBuffer sb=new StringBuffer(s);
		
		for(int i=0;i<sb.length();i++)
		{
			int x=0;
			char c=sb.charAt(i);
			while(sb.indexOf(String.valueOf(c))!=sb.lastIndexOf(String.valueOf(c)))
			{
				sb.deleteCharAt(sb.lastIndexOf(String.valueOf(c)));
				x=1;
			}
			if(x==1)
			{
				sb.deleteCharAt(sb.indexOf(String.valueOf(c)));
				i--;
			}
		}
		System.out.println(sb);
	}

}
