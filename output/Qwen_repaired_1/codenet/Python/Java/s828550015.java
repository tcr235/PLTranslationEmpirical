import java.util.Arrays;
import java.util.Scanner;

public class s828550015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y = scanner.nextInt(), a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        String[] partsP = scanner.nextLine().split(" ");
        String[] partsQ = scanner.nextLine().split(" ");
        String[] partsR = scanner.nextLine().split(" ");

        int[] p = Arrays.stream(partsP).mapToInt(Integer::parseInt).boxed().sorted((i1, i2) -> i2 - i1).limit(x).mapToInt(o -> o).toArray();
        int[] q = Arrays.stream(partsQ).mapToInt(Integer::parseInt).boxed().sorted((i1, i2) -> i2 - i1).limit(y).mapToInt(o -> o).toArray();
        int[] r = Arrays.stream(partsR).mapToInt(Integer::parseInt).boxed().sorted((i1, i2) -> i2 - i1).mapToInt(o -> o).toArray();

        int[] pq = new int[p.length + q.length];
        System.arraycopy(p, 0, pq, 0, p.length);
        System.arraycopy(q, 0, pq, p.length, q.length);
        Arrays.sort(pq);

        int minIndex = Math.min(x + y, Math.min(a + b, c));
        for (int i = 0; i < minIndex; i++) {
            if (pq[i] < r[Math.min(i, pq.length - 1)]) {
                pq[i] = r[Math.min(i, pq.length - 1)];
            }
        }

        System.out.println(Arrays.stream(pq).mapToLong(Long::sum).intValue());
    }
}