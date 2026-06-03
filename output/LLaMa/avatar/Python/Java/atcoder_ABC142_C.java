import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] input = scanner.nextLine().split(" ");
        Pair[] A = new Pair[input.length];
        for (int i = 0; i < input.length; i++) {
            A[i] = new Pair(i + 1, Integer.parseInt(input[i]));
        }

        Arrays.sort(A, (p1, p2) -> Integer.compare(p1.value, p2.value));

        int[] A__ = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            A__[i] = A[i].position;
        }

        for (int i = 0; i < A__.length - 1; i++) {
            System.out.print(A__[i] + " ");
        }
        System.out.println(A__[A__.length - 1]);
    }

    static class Pair {
        int position;
        int value;

        public Pair(int position, int value) {
            this.position = position;
            this.value = value;
        }
    }
}