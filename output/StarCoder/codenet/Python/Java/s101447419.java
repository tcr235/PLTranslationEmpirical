```java
import java.util.*;
import java.io.*;

public class Main {
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
        if (!ce.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey().equals(
                co.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey())) {
            ans = n - ce.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue()
                    - co.entrySet().stream().max(Map.Entry.comparingByValue()).get().getValue();
        } else if (ce.size() == 1 && co.size() == 1) {
            ans = n - ce.values().stream().findFirst().get();
        } else if (ce.size() == 1) {
            ans = n - ce.values().stream().findFirst().get()
                    - co.values().stream().sorted().skip(1).findFirst().get();
        } else if (co.size() == 1) {
            ans = n - co.values().stream().findFirst().get()
                    - ce.values().stream().sorted().skip(1).findFirst().get();
        } else {
            int minCeVo = Math.min(ce.values().stream().sorted().skip(1).findFirst().get(),
                    co.values().stream().sorted().skip(1).findFirst().get());
            int minCoVe = Math.min(co.values().stream().sorted().skip(1).findFirst().get(),
                    ce.values().stream().sorted