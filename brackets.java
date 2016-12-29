import java.util.Scanner;

public class brackets
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		n=n*2;
		
		int x=0;
		String s="",s1="";
		
		for(int i=0;i<Math.pow(2,n);i++)
		{
			x=0;
			s=Integer.toBinaryString(i);
			int z=s.length();
			
			if(s.length()<n)
			{
				for(int j=0;j<n-z;j++)
					s='0'+s;
			}
			for(int j=0;j<n;j++)
			{
				
				if(s.charAt(j)=='0')
				{
					x--;
					s1=s1+')';
				}
				else
				{
					x++;
					s1=s1+'(';
				}
				
				if(x<0)
					break;
			}
			
			if(s1.length()==n&&x==0)
				System.out.println(s1);
			
			s1="";
			s="";
		}

	}

}
