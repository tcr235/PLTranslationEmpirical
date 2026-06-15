import java.util.*;

public class s622795537 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> arr = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (!arr.containsKey(s)) {
                arr.put(s, 1);
            } else {
                int count = arr.get(s);
                arr.put(s, count + 1);
            }
        }

        int maxCount = Collections.max(Arrays.asList(arr.values()));
        List<String> dic = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : arr.entrySet()) {
            if (entry.getValue() == maxCount) {
                dic.add(entry.getKey());
            }
        }

        Collections.sort(dic);
        for (String s : dic) {
            System.out.print(s + " ");
        }
    }
}
