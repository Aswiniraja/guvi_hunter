public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 ArrayList<Integer> a=new ArrayList<Integer>();
		 
		 int n=0,x=1000;
			
			System.out.println("enter the size of array");
			n=sc.nextInt();
			
			for(int i=0;i<n;i++)
				a.add(sc.nextInt());
		
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(Math.abs(x)>Math.abs(a.get(i)+a.get(j)))
						x=a.get(i)+a.get(j);
				}
			}
  System.out.println(x);
	}
