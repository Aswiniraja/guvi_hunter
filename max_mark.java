import java.util.Scanner;

public class max_mark 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		StringBuffer s1=new StringBuffer(s);
		s1.deleteCharAt(0);
		s1.deleteCharAt(s1.length()-1);
		s=s1.toString();
		
		String[] ss=s.split(",");
		int a=0;
		String a1 = null;
		
		for(int i=0;i<ss.length;i++)
		{
			//to remove the quotes
			s1=new StringBuffer(ss[i]);
			s1.deleteCharAt(0);
			s1.deleteCharAt(s1.length()-1);
			ss[i]=s1.toString();
			
			// to split and check the max marks
			String[] b=ss[i].split("#");
			int c=0;
			for(int j=1;j<b.length;j++)
			{
				c=c+Integer.parseInt(b[j]);
			}
			if(a<c)
			{
				a=c;
				a1=b[0];
			}
				
		}
		
		
		
		System.out.println(a1);
		sc.close();

	}

}
