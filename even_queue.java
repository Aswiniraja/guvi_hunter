import java.util.ArrayList;
import java.util.Scanner;

public class even_queue 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		ArrayList<String> b=new ArrayList<String>();
		
		System.out.println("enter the length");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
			a.add(sc.next());
		do
		{
			b.clear();
		for(int i=1;i<a.size();i=i+2)
			b.add(a.get(i));
		
		a.clear();
		a=new ArrayList<String>(b);
		}while(b.size()>1);
		
		System.out.println(a);
	}
	

}
