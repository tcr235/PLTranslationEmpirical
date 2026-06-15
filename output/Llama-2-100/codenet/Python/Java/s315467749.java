import java.util.Scanner;

public class s315467749 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> S = new ArrayList<>();
        List<Integer> T = new ArrayList<>();

        S = Arrays.asList(sc.next().split(" "));
        T = Arrays.asList(sc.next().split(" "));

        int q = sc.nextInt();

        int ans = 0;
        for (int i : T) {
            if (i == S.get(S.size() - 1) || i == S.get(0)) {
                ans++;
            } else {
                int left = 0;
                int right = n - 1;
                while (right - left > 1) {
                    int mid = (left + right) / 2;
                    if (S.get(mid) == i) {
                        ans++;
                        break;
                    } else if (S.get(mid) < i) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
