import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        List<int[]> info = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            int t = Integer.parseInt(line[0]);
            int d = Integer.parseInt(line[1]);
            info.add(new int[]{t, d});
        }

        Collections.sort(info, (a, b) -> b[1] - a[1]);

        List<Integer> selectedOnly = new ArrayList<>();
        List<Integer> selectedChohuku = new ArrayList<>();
        List<Integer> unselectedOnly = new ArrayList<>();
        Map<Integer, Integer> memo = new HashMap<>();

        for (int[] pair : info.subList(0, k)) {
            int t = pair[0];
            int d = pair[1];
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                selectedOnly.add(d);
            } else {
                selectedChohuku.add(d);
            }
        }

        int cntType = memo.size();
        for (int[] pair : info.subList(k, n)) {
            int t = pair[0];
            int d = pair[1];
            if (!memo.containsKey(t)) {
                memo.put(t, 1);
                unselectedOnly.add(d);
            }
        }

        unselectedOnly.sort(Collections.reverseOrder());
        int sumSelect = selectedChohuku.stream().mapToInt(Integer::intValue).sum() + selectedOnly.stream().mapToInt(Integer::intValue).sum();
        int ans = cntType * cntType + sumSelect;

        for (int i = 0; i < Math.min(selectedChohuku.size(), unselectedOnly.size()); i++) {
            cntType++;
            sumSelect += unselectedOnly.get(i);
            sumSelect -= selectedChohuku.get(i);
            selectedChohuku.remove(selectedChohuku.size() - 1);
            unselectedOnly.remove(unselectedOnly.size() - 1);
            tmp: int tmp = cntType * cntType + sumSelect;
            ans = Math.max(ans, tmp);
        }

        System.out.println(ans);
    }
}