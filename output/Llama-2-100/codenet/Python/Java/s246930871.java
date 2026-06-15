public class s246930871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = (N/((A+B))*A) + Math.min(A, N%(A+B));
        System.out.println(ans);
    }
}
