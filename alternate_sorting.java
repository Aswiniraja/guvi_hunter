import java.util.Arrays;
import java.util.Scanner;

public class first_maximum
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		Arrays.sort(a);
		int i=0,j=n-1;
		int x=1;
		int k=0;
		do
		{
		if(x==1)
			{
				b[k]=a[j];
				j--;
				k++;
				x=0;
			}
		else
			{
				b[k]=a[i];
				i++;
				k++;
				x=1;
			}
		}while(j-i>=0);
		
		for(i=0;i<n;i++)
			System.out.print(b[i]+" ");		
	}

}
