import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> p = new ArrayList<>();
        List<Integer> h = new ArrayList<>();
        Map<Integer, List<Integer>> path = new HashMap<>();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            p.add(i);
            h.add(scanner.nextInt());
        }
        for (int i = 1; i <= m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (path.containsKey(a)) {
                path.get(a).add(b);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(b);
                list.add(a);
                path.put(a, list);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (h.get(i) <= h.get(path.get(i).get(0))) {
                c++;
            }
        }
        System.out.println(c);
    }
}


