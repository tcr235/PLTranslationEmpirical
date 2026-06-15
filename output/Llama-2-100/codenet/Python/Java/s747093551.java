Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int M=sc.nextInt();
int X=sc.nextInt();
int Y=sc.nextInt();
List<Integer> x=new ArrayList<>();
List<Integer> y=new ArrayList<>();
for(int i=0;i<N;i++)
{
x.add(sc.nextInt());
}
for(int i=0;i<M;i++)
{
y.add(sc.nextInt());
}
if(max(max(x),X)<min(min(y),Y))
System.out.println("No War");
else
System.out.println("War");
