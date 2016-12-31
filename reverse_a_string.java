public class string_reverse
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		String ss=sc.nextLine();
		String[] s1=ss.split(" ");
		ss="";
		
		for(int i=s1.length-1;i>=0;i--)
		ss=ss+s1[i]+" ";	
		
		ss.trim();
		System.out.println(ss);
	}

}
