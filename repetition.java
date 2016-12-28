public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 ArrayList<Integer> a=new ArrayList<Integer>();
		 
		 int n=0,x;
			
			System.out.println("enter the size of array");
			n=sc.nextInt();
			
			for(int i=0;i<n;i++)
				a.add(sc.nextInt());
		
			for(int i=0;i<n;i++)
			{
				x=a.get(i);
				if(a.indexOf(x)==a.lastIndexOf(x))
					System.out.println(x);
			}

	}
