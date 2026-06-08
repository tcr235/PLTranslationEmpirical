import java.util.Arrays;
import java.util.Scanner;

public class s828550015 {
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

        Integer[] p = Arrays.stream(input2).map(Integer::parseInt).boxed()
                .sorted((i, j) -> j.compareTo(i)).limit(x).toArray();

        Integer[] q = Arrays.stream(input3).map(Integer::parseInt).boxed()
                .sorted((i, j) -> j.compareTo(i)).limit(y).toArray();

        Integer[] r = Arrays.stream(input3).map(Integer::parseInt).boxed()
                .sorted((i, j) -> j.compareTo(i)).toArray();

        Integer[] pq = new Integer[Math.min(x + y, a + b, c)];
        int index = 0;
        for (int i = 0; i < p.length && i < q.length; i++) {
            pq[index++] = Math.max(p[i], q[i]);
        }
        for (int i = index; i < Math.min(x, a + b, c); i++) {
            pq[i] = p[i];
        }
        for (int i = index; i < Math.min(y, a + b, c); i++) {
            pq[i] = q[i];
        }

        int left = Math.min(y, a + b, c);
        int right = Math.min(c, left + Math.min(x, a + b, c));

        for (int i = left; i < right; i++) {
            pq[i] = r[i];
        }

        int[] prq = Arrays.copyOfRange(pq, 0, right);
        int sum = 0;
        for (int num : prq) {
            sum += num;
        }
        System.out.println(sum);
    }
}