import java.util.Scanner;

public class s846046431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            A.add(scanner.nextInt());
        }
        Collections.sort(A, Collections.reverseOrder());
        double S = A.stream().reduce((a, b) -> a + b).orElse(0);
        for (int a : A) {
            if (a / S - 1 / (4 * M) < 0) {
                System.out.println("No");
                break;
            }
        }
        System.out.println("Yes");
    }
}
