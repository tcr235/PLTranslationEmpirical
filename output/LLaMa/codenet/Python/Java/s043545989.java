import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] aStr = sc.nextLine().split(" ");
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(aStr[i]);
        }
        int klen = new HashSet<>(Arrays.asList(a)).size();
        Map<Integer, Integer> B = new HashMap<>();
        for (int x : a) {
            B.put(x, B.getOrDefault(x, 0) + 1);
        }
        String[] k = new String[B.size()];
        int[] v = new int[B.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : B.entrySet()) {
            k[i] = entry.getKey().toString();
            v[i] = entry.getValue();
            i++;
        }
        if (klen == 3 && (Integer.parseInt(k[0]) ^ Integer.parseInt(k[1]) ^ Integer.parseInt(k[2])) == 0 && v[0] == v[1] && v[1] == v[2]) {
            System.out.println("Yes");
        } else if (klen == 2 && Arrays.asList(k).contains("0") && (v[0] == 2 * v[1] || v[1] == 2 * v[0])) {
            System.out.println("Yes");
        } else if (klen == 1 && Arrays.asList(k).contains("0")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}