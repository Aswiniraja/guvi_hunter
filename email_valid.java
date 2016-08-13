import java.util.Scanner;

public class mail
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		if(s.contains("@")&&s.contains(".")&&(s.indexOf("@")==s.lastIndexOf("@"))&&(s.indexOf(".")==s.lastIndexOf("."))&&(s.indexOf(".")-s.indexOf("@")-1>=4)&&s.indexOf("@")>3&&s.endsWith(".com"))
				System.out.println("valid");
		else
			System.out.println("invalid");
		
		sc.close();

	}

}
