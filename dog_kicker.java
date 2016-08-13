import java.util.Scanner;

public class dog_kicker 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		String[] ss=s.split(" ");
		
		for(int i=0;i<ss.length;i++)
		{
			int z1=0;
			//to check for valid data
			for(int j=0;j<ss[i].length();j++)
			{
				z1=0;
				if(Character.isDigit(ss[i].charAt(j)))
				{
					z1=1;
				}
				else
				{
					z1=2;
					break;
				}
					
			}
			
			if(z1==1)
			{
						int f=0;
						int a=Integer.parseInt(ss[i]);
						int n=1;
						do
						{
							if(n==a)
								f=1;
							n=n*2;
							
						}while(n<=a);
						
						if(f==1)
							System.out.print("True ");
						else
							System.out.print("False ");
			}
			else
				System.out.println("invalid");
		}
		
		
		
		
		sc.close();
	}

}
