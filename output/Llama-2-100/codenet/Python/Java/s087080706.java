public class s087080706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        int i = bisect(a, x);
        ans = Math.min(a.length <= i ? a.length : a.length - (i + 1), a.length - i);
        System.out.println(ans);
    }
}
