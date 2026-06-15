public class s828550015 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] p=new int[x];
        int[] q=new int[y];
        int[] r=new int[c];
        for(int i=0;i<x;i++)
            p[i]=sc.nextInt();
        for(int i=0;i<y;i++)
            q[i]=sc.nextInt();
        for(int i=0;i<c;i++)
            r[i]=sc.nextInt();
        int[] pq=new int[min(x+y,a+b,c)];
        for(int i=0;i<pq.length;i++)
            pq[i]=Math.min(p[i],q[i],r[i]);
        System.out.println(Arrays.toString(pq));
    }
}
