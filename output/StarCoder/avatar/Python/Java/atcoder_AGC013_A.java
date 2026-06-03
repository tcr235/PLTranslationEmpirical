import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        ArrayList<Long> A = new ArrayList<>();
        while (scanner.hasNextLong()) {
            long k = scanner.nextLong();
            if (A.isEmpty() || !A.get(A.size() - 1).equals(k)) {
                A.add(k);
            }
        }
        int n = A.size();
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            if ((A.get(i - 1) < A.get(i) && A.get(i) > A.get(i + 1)) ||
                (A.get(i - 1) > A.get(i) && A.get(i) < A.get(i + 1))) {
                ans++;
                i++;
            }
        }
        System.out.println(ans + 1);
    }
}