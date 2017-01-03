import java.util.Arrays;
import java.util.Scanner;

public class students_height
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int[] a=new int[50];
	
	System.out.println("enter the height of 50 students");
	for(int i=0;i<50;i++)
		a[i]=sc.nextInt();
	
	System.out.println("enter the position");
	int n=sc.nextInt();
	
	Arrays.sort(a);
	System.out.println(a[50-n]);

	}

}
