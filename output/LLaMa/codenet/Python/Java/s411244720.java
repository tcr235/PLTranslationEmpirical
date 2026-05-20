import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> s = new HashSet<>();

        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            int[] A = new int[d];
            for (int j = 0; j < d; j++) {
                A[j] = sc.nextInt();
            }
            Set<Integer> temp = new HashSet<>();
            for (int num : A) {
                temp.add(num);
            }
            s.addAll(temp);
        }
        System.out.println(n - s.size());
    }
}