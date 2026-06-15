public class s814885508 {
    public static void main(String[] args) {
        int X, K, D;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        K = sc.nextInt();
        D = sc.nextInt();

        int r = X / D;
        if (Math.abs(r) > K) {
            int diff = Math.abs(X) - K * D;
            System.out.println(diff);
            return;
        }
        int a = X - r * D;
        if ((K - r) % 2 == 0) {
            System.out.println(a);
        } else {
            int diff = Math.abs(D - a);
            System.out.println(diff);
        }
    }
}
