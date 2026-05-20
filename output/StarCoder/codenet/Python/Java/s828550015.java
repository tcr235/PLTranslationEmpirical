import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int[] p = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().sorted((i1, i2) -> i2 - i1).limit(x).mapToInt(i -> i).toArray();
        int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().sorted((i1, i2) -> i2 - i1).limit(y).mapToInt(i -> i).toArray();
        int[] r = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).boxed().sorted((i1, i2) -> i2 - i1).mapToInt(i -> i).toArray();
        int[] pq = Arrays.copyOf(p, p.length + q.length);
        System.arraycopy(q, 0, pq, p.length, q.length);
        Arrays.sort(pq);
        for (int i = Math.min(x + y, Math.min(a + b, c)); i < pq.length; i++) {
            if (pq[i] < r[Math.min(i - x, i - x - y, Math.min(Math.max(0, i - x), Math.max(0, i - y)) - 1]) {
                pq[i] = r[Math.min(i - x, i - x - y, Math.min(Math.max(0, i - x), Math.max(0, i - y)) - 1];
            }
        }
        System.out.println(Arrays.stream(pq).mapToLong(Long::sum).intValue());
    }
}