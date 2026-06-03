import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        List<Integer> p = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            p.add(i);
        }

        Map<Integer, Integer> hp = new HashMap<>();
        String[] hs = scanner.nextLine().split(" ");
        for (int i = 0; i < n; ++i) {
            hp.put(p.get(i), Integer.parseInt(hs[i]));
        }

        List<List<Integer>> path = new ArrayList<>(Collections.nCopies(n, new ArrayList<>()));
        for (int i = 0; i < m; ++i) {
            String[] ab = scanner.nextLine().split(" ");
            int a = Integer.parseInt(ab[0]) - 1;
            int b = Integer.parseInt(ab[1]) - 1;
            path.get(a).add(b);
            path.get(b).add(a);
        }

        int c = 0;
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            int i = entry.getKey() - 1;
            boolean f = true;
            for (int j : entry.getValue()) {
                if (hp.get(i + 1) > hp.get(j + 1)) {
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