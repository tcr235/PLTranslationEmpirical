import java.util.*;
import java.io.*;

public class atcoder_ABC143_D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < input.length; ++i) {
            list.add(Integer.parseInt(input[i]));
        }
        Collections.sort(list);
        long ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int a = list.get(i);
                int b = list.get(j);
                int left = bisectRight(list, Math.max(a - b, b - a));
                int right = bisectLeft(list, a + b);
                if (left <= i && i < right) --right;
                if (left <= j && j < right) --right;
                ans += Math.max(0, right - left);
            }
        }
        System.out.println(ans / 3);
    }

    private static int bisectRight(List<Integer> list, int key) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (key < list.get(mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    private static int bisectLeft(List<Integer> list, int key) {
        int low = 0, high = list.size();
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (key <= list.get(mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}