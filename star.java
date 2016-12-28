import java.util.Scanner;

public class star
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		String s="";
		
		for(int i=0;i<n;i++)
			s=s+"*";
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
				System.out.print(s+" ");
			
			System.out.println();
			s=s.substring(0, s.length()-1);
		}

	}

}
