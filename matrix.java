package hunter;

import java.util.Scanner;

public class matrix_0s_to0s
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number of rows and colums");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int[][] a=new int[r][c];
		int[][] b=new int[r][c];
		
		System.out.println("enter the values");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
				b[i][j]=a[i][j];
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(a[i][j]==0)
				{
					for(int k=0;k<c;k++)
						b[i][k]=0;
					for(int k=0;k<r;k++)
						b[k][j]=0;
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

	}

}
