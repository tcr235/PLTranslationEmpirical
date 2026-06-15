import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        List<Integer> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(accumulate(A, i));
        }
        double ans = Double.POSITIVE_INFINITY;
        for (int k = 0; k < N; k++) {
            int E = k * X + 2 * sum(S, k);
            ans = Math.min(ans, E);
        }
        System.out.println(ans + N * X + 5 * S.get(S.size() - 1));
    }

    public static int sum(List<Integer> list, int start) {
        int sum = 0;
        for (int i = start; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static int accumulate(List<Integer> list, int start) {
        int accum = 0;
        for (int i = start; i < list.size(); i++) {
            accum += list.get(i);
        }
        return accum;
    }
}


