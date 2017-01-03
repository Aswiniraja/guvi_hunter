public class subset_1
{

	public static void main(String[] args)
	{
		
		
		int[] a11=new int[]{5,1,4,3,4};
		int[] a22=new int[]{5,2,1,4,9,3};
		
		
		int x1=0;
		
		for(int i=0;i<a11.length;i++)
		{
			int n=0;
			for(int j=0;j<a22.length;j++)
			{
				if(a11[i]==a22[j])
				{
					a22[j]=0;
					n=1;
				}
			}
			if(n==0)
				x1=1;
		}
		
		if(x1==0)
			System.out.println("It is a subset");
		else
			System.out.println("It is not a subset");
		
	}

}
