import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        String[] input3 = scanner.nextLine().split(" ");

        int x = Integer.parseInt(input1[0]);
        int y = Integer.parseInt(input1[1]);
        int a = Integer.parseInt(input1[2]);
        int b = Integer.parseInt(input1[3]);
        int c = Integer.parseInt(input1[4]);

        int[] p = Arrays.stream(input2).mapToInt(Integer::parseInt).boxed()
                .sorted((i, j) -> j.compareTo(i)).limit(x).mapToInt(i -> i).toArray();

        int[] q = Arrays.stream(input3).mapToInt(Integer::parseInt).boxed()
                .sorted((i, j) -> j.compareTo(i)).limit(y).mapToInt(i -> i).toArray();

        int[] r = Arrays.stream(input3).mapToInt(Integer::parseInt).boxed()
                .sorted((i, j) -> j.compareTo(i)).toArray();

        int[] pq = Arrays.copyOf(p, Math.min(x + y, a + b, c));
        for (int i = 0; i < pq.length; i++) {
            if (i < p.length && i < q.length) {
                pq[i] = Math.max(pq[i], Math.max(p[i], q[i]));
            } else if (i < p.length) {
                pq[i] = Math.max(pq[i], p[i]);
            } else {
                pq[i] = Math.max(pq[i], q[i]);
            }
        }

        for (int i = Math.min(x + y, a + b, c); i < Math.min(a + b, c); i++) {
            pq[i] = r[i];
        }

        int sum = 0;
        for (int num : pq) {
            sum += num;
        }
        System.out.println(sum);
    }
}