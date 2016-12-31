import java.util.Scanner;

public class co_prime 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt(),b=sc.nextInt();
		int x=0;
		
		for(int i=2;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
				x=1;
		}
		if(x==0)
			System.out.println("co-prime");
		else
			System.out.println("not co-prime");

	}

}
