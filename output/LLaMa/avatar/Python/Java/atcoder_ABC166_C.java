import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
        }

        int[] h = new int[n];
        input = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(input[i]);
        }

        Map<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hp.put(p[i], h[i]);
        }

        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            path.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            input = scanner.nextLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            path.get(a).add(b);
            path.get(b).add(a);
        }

        int c = 0;
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            boolean f = true;
            for (Integer neighbor : entry.getValue()) {
                if (hp.get(entry.getKey()) <= hp.get(neighbor)) {
                    f = false;
                    break;
                }
            }
            if (f) {
                c++;
            }
        }

        System.out.println(c);
    }
}