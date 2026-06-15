public class s724326345 {
    public static void main(String[] args) {
        int A, B, C, X, Y;
        A = Integer.parseInt(sc.nextLine());
        B = Integer.parseInt(sc.nextLine());
        C = Integer.parseInt(sc.nextLine());
        X = Integer.parseInt(sc.nextLine());
        Y = Integer.parseInt(sc.nextLine());

        int ans = (int) (10 * Math.pow(10, 10));

        for (int k = Math.max(X, Y) + 1; k > 0; k--) {
            int total = 2 * C * k + A * Math.max(0, X - k) + B * Math.max(0, Y - k);
            if (total < ans) {
                ans = total;
            }
        }

        System.out.println(ans);
    }
}
