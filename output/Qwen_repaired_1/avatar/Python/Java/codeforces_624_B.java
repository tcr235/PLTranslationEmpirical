import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] arr=sc.nextLine().split(" ");
        List<Integer> a=Arrays.stream(arr).map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(a,Collections.reverseOrder());
        long ans=0;
        double pre=Double.MAX_VALUE;
        for(int j:a){
            ans+=Math.max(0,Math.min((int)pre-1,j));
            pre=Math.max(0,Math.min((int)pre-1,j));
        }
        System.out.println(ans);
        sc.close();
    }
}