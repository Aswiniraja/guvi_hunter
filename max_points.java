import java.util.Scanner;

public class max_points 
{

	public static void main(String[] args)
	{
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows and colums");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int[][] a=new int[r][c];
		
		System.out.println("enter the values");
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		
		int sum=a[0][0];
		int i=0,j=0;
		
		for(i=0,j=0;(i+1<r&&j+1<c);i=i)
		{
		
			if(a[i+1][j]>a[i][j+1])
			{
				i++;
				sum=sum+a[i][j];
			}
			else
			{
					j++;
					sum=sum+a[i][j];
			}
		}
		if(i+1<r)
		{
			for(int k=i+1;k<r;k++)
				sum=sum+a[k][c-1];
		}
		else if(j+1<c)
		{
			for(int k=j+1;k<c;k++)
				sum=sum+a[r-1][k];
		}
		System.out.println(sum);
		}

}
