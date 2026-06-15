import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class s043545989 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            a.add(Integer.parseInt(args[i + 1]));
        }
        Map<Integer, Integer> B = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            B.put(a.get(i), B.get(a.get(i)) + 1);
        }
        List<Integer> k = new ArrayList<>();
        List<Integer> v = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : B.entrySet()) {
            k.add(entry.getKey());
            v.add(entry.getValue());
        }
        if (B.size() == 3 && (k.get(0) * k.get(1) * k.get(2)) == 0 && v.get(0) == v.get(1) == v.get(2)) {
            System.out.println("Yes");
        } else if (B.size() == 2 && (k.get(0) * k.get(1)) == 0 && (v.get(0) == 2 * v.get(1) || v.get(1) == 2 * v.get(0))) {
            System.out.println("Yes");
        } else if (B.size() == 1 && k.get(0) == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
