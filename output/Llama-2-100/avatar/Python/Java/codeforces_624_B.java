import java.util.Scanner;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        double pre = Double.POSITIVE_INFINITY;
        int ans = 0;
        a.sort(Collections.reverseOrder());
        for (int j = 0; j < n; j++) {
            ans += Math.max(0, Math.min(pre - 1, a.get(j)));
            pre = Math.max(0, Math.min(pre - 1, a.get(j)));
        }
        System.out.println(ans);
    }
}


