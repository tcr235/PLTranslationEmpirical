```java
import java.util.*;
import java.io.*;

public class s101447419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] v = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int[] ve = new int[n / 2];
        int[] vo = new int[n / 2];
        for (int i = 0; i < n / 2; i++) {
            ve[i] = v[2 * i];
            vo[i] = v[2 * i + 1];
        }
        Map<Integer, Integer> ce = new HashMap<>();
        Map<Integer, Integer> co = new HashMap<>();
        for (int i = 0; i < n / 2; i++) {
            ce.put(ve[i], ce.getOrDefault(ve[i], 0) + 1);
            co.put(vo[i], co.getOrDefault(vo[i], 0) + 1);
        }
        int ans = n;
        if (!ce.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow().getKey().equals(
                co.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow().getKey())) {
            ans = n - ce.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow().getValue()
                    - co.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow().getValue();
        } else if (ce.size() == 1 && co.size() == 1) {
            ans = n - ce.values().stream().findFirst().orElseThrow();
        } else if (ce.size() == 1) {
            ans = n - ce.values().stream().findFirst().orElseThrow()
                    - co.values().stream().sorted().skip(1).findFirst().orElseThrow();
        } else if (co.size() == 1) {
            ans = n - co.values().stream().findFirst().orElseThrow()
                    - ce.values().stream().sorted().skip(1).findFirst().orElseThrow();
        } else {
            int minCeVo = Math.min(ce.values().stream().sorted().skip(1).findFirst().orElseThrow(),
                    co.values().stream().sorted().skip(1).findFirst().orElseThrow());
            int minCoVe = Math.min(co.values().stream().sorted().skip(1).