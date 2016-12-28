import java.util.Scanner;

public class string_reverse
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		String s;
		System.out.println("enter the string");
		s=sc.nextLine();
		String[] s1=s.split(" ");
		s="";
		
		for(int i=s1.length-1;i>=0;i--)
		s=s+s1[i]+" ";	
		
		s.trim();
		System.out.println(s);
	}

}
