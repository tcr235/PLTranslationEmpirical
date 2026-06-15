import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class atcoder_ABC124_C {
    public static void main(String[] args) {
        List<String> s = new ArrayList<>();
        s.addAll(Arrays.asList(input().split(" ")));
        Map<String, Integer> even = new TreeMap<>();
        Map<String, Integer> odd = new TreeMap<>();
        for (int i = 0; i < s.size(); i++) {
            if (i % 2 == 0) {
                even.put(s.get(i), even.get(s.get(i)) + 1);
            } else {
                odd.put(s.get(i), odd.get(s.get(i)) + 1);
            }
        }
        int min = Math.min(s.size() - (even.get(s.get(0)) + odd.get(s.get(1))), s.size() - (even.get(s.get(1)) + odd.get(s.get(0))));
        System.out.println(min);
    }
}


