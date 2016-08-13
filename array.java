import java.util.Scanner;

public class array 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int max=0;
		int pos = 0;
		a[0]=sc.nextInt();
		for(int i=1;i<n;i++)
		{
			a[i]=sc.nextInt();
			int dif=Math.abs(a[i-1]-a[i]);
		
			if(max<dif)
			{
				max=dif;
				pos=i-1;
			}
		}
		System.out.println(pos);
		
		sc.close();

	}

}
