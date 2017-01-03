import java.util.ArrayList;
import java.util.Scanner;

public class repetition
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 ArrayList<Integer> a1=new ArrayList<Integer>();
		 
		 int n1=0,x;
			
			System.out.println("enter the size of array");
			n1=sc.nextInt();
			
			for(int i=0;i<n1;i++)
				a1.add(sc.nextInt());
		
			for(int i=0;i<n1;i++)
			{
				x=a1.get(i);
				if(a1.indexOf(x)==a1.lastIndexOf(x))
					System.out.println(x);
			}

	}

}
