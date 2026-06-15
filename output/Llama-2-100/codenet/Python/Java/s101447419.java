import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class s101447419 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            v.add(Integer.parseInt(args[i + 1]));
        }
        List<Integer> ve = new ArrayList<>();
        List<Integer> vo = new ArrayList<>();
        for (int i = 0; i < n / 2; i++) {
            ve.add(v.get(2 * i));
            vo.add(v.get(2 * i + 1));
        }
        Map<Integer, Integer> ce = new TreeMap<>();
        Map<Integer, Integer> co = new TreeMap<>();
        for (int i = 0; i < ve.size(); i++) {
            ce.put(ve.get(i), 1);
            co.put(vo.get(i), 1);
        }
        int ans = n;
        if (!ce.isEmpty() && !co.isEmpty()) {
            int maxCe = ce.values().stream().max().orElse(0);
            int maxCo = co.values().stream().max().orElse(0);
            ans = n - maxCe - maxCo;
        } else if (ce.size() == 1 && co.size() == 1) {
            ans = n - ce.values().stream().findFirst().orElse(0) - co.values().stream().findFirst().orElse(0);
        } else if (ce.size() == 1) {
            ans = n - ce.values().stream().findFirst().orElse(0) - co.values().stream().findFirst().orElse(0);
        } else if (co.size() == 1) {
            ans = n - co.values().stream().findFirst().orElse(0);
        } else {
            ans = Math.min(n - ce.values().stream().findFirst().orElse(0), n - co.values().stream().findFirst().orElse(0));
        }
        System.out.println(ans);
    }
}
