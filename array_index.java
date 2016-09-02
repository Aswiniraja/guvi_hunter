public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

  int n=sc.nextInt();
  
  int[] a=new int[n];
  String s="";
  
  for(int i=0;i<n;i++)
  {
    a[i]=sc.nextInt();
    s=s+a[i]+",";
  }
  for(int i=0;i<n;i++)
  {
    if(s.indexOf(a[i])==s.lastIndexOf(a[i]))
      {
      System.out.println(a[i]);
      break;
      }
  }
