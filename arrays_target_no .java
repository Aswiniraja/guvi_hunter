import java.util.Scanner;

public class arrays_target_no 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size");
		int r=sc.nextInt();
		
		int[] a=new int[r];
		
		System.out.println("enter the values");
		for(int i=0;i<r;i++)
				a[i]=sc.nextInt();
		System.out.println("Enter the target");
		int target=sc.nextInt();
		
		for(int i=0;i<r;i++)
			for(int j=i+1;j<r;j++)
				if(a[i]+a[j]==target)
					System.out.println(a[i]+" "+a[j]);

	}

}
