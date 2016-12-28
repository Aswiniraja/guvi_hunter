public class array3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	 ArrayList<Integer> a=new ArrayList<Integer>();
	 ArrayList<Integer> a1=new ArrayList<Integer>();
	 int n=0;
		
		System.out.println("enter the size of array");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
			if(i==a.get(i))
				a1.add(a.get(i));
		}
		
		System.out.println(a1);	
	}

}
