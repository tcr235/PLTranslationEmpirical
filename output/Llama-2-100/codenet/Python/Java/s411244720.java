import java.util.*;

public class s411244720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Set<Integer> S = new HashSet<>();
        for (int i = 0; i < K; i++) {
            int d = sc.nextInt();
            List<Integer> A = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                A.add(sc.nextInt());
            }
            S.addAll(A);
        }
        int result = N - S.size();
        System.out.println(result);
    }
}
