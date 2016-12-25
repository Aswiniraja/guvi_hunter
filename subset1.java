public class subset
{

	public static void main(String[] args)
	{
		
		
		int[] a1=new int[]{5,1,4,3,4};
		int[] a2=new int[]{5,2,1,4,9,3};
		
		
		int x=0;
		
		for(int i=0;i<a1.length;i++)
		{
			int n=0;
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					a2[j]=0;
					n=1;
				}
			}
			if(n==0)
				x=1;
		}
		
		if(x==0)
			System.out.println("It is a subset");
		else
			System.out.println("It is not a subset");
		
	}

}
