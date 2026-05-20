import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // to consume newline left-over
        Map<String, Integer> arr = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            if (arr.containsKey(s)) {
                arr.put(s, arr.get(s) + 1);
            } else {
                arr.put(s, 1);
            }
        }

        int maxCount = Collections.max(arr.values());
        Set<String> dic = new HashSet<>();
        for (Map.Entry<String, Integer> entry : arr.entrySet()) {
            if (entry.getValue() == maxCount) {
                dic.add(entry.getKey());
            }
        }

        List<String> sortedDic = new ArrayList<>(dic);
        Collections.sort(sortedDic);
        for (String s : sortedDic) {
            System.out.println(s);
        }
    }
}