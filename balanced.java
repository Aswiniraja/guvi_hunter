import java.util.Scanner;

public class balanced
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		char c = 0;
		
		String[] ss=s.split(" ");
		
		for(int i=0;i<ss.length;i++)
		{
			int f=0;
			
			for(int j=0;j<ss[i].length();j++)
			{
				int a=ss[i].charAt(j);
				if(a>96&&a<123)
					a=a-96;
				else if(a>64&&a<91)
					a=a-64;
				
				if(j==0)
				{
					if(a<=13)
						c='l';
					if(a>=14&&a<=26)
						c='u';
				}
				else if(c=='l')
				{
					c='u';
					if(a<=13)
						f=1;
				}
				else if(c=='u')
				{
					c='l';
					if(a>=14&&a<=26)
						f=1;
				}
			}
			
			if(f==0)
				System.out.println(ss[i]+" is balanced");
			else
				System.out.println(ss[i]+" is not balanced");
		}
		
		
		sc.close();

	}

}
