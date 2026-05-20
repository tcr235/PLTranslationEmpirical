import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        while (K-- > 0) {
            int d = scanner.nextInt();
            for (int i = 0; i < d; i++) {
                int num = scanner.nextInt();
                set.add(num);
            }
        }

        System.out.println(N - set.size());
        scanner.close();
    }
}