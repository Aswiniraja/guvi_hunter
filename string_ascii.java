import java.util.Scanner;

public class string_ascii 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		int sum=0;
		
		for(int i=1;i<s.length();i++)
		{
			sum=sum+((int)(s.charAt(i)-(int)(s.charAt(i-1))));
		}

		sum=(int)(s.charAt(0))-sum;
		System.out.println((char)sum);
	}

}
