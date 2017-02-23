import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class child 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[][] s=new String[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				s[i][j]=sc.next();
			}
		}
		String s1=sc.next();
		String s2;
		int c=0;
		
		Set<String> ss=new TreeSet<String>();
		for(int i=0;i<n;i++)
		{
			if(s1.equalsIgnoreCase(s[i][1]))
			{
			s2=s[i][0];
			for(int j=0;j<n;j++)
			{
				if(s[j][1].equalsIgnoreCase(s2))
					ss.add(s[j][0]);
			}
			
			}
		}
		
		System.out.println(ss.size());

	}
