```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[][] ZIP(int n) {
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = nextInt();
                arr[i][1] = nextInt();
            }
            return arr;
        }

        int[] LIST() {
            String[] line = br.readLine().trim().split(" ");
            int[] arr = new int[line.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(line[i]);
            }
            return arr;
        }

        long[] MAP() {
            String[] line = br.readLine().trim().split(" ");
            long[] arr = new long[line.length];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(line[i]);
            }
            return arr;
        }

        long count_chars() {
            return br.readLine().trim().length();
        }

        int INT() {
            return Integer.parseInt(br.readLine().trim());
        }

        long gcd(long a, long b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        long pow(long x, long y, long mod) {
            if (y == 0)
                return 1;
            if (y == 1)
                return x;
            long ans = pow(x, y / 2, mod);
            ans = (ans * ans) % mod;
            if (y % 2 == 1)
                ans = (ans * x) % mod;
            return ans;
        }

        long sqrt(long x) {
            long low = 1, high = x / 2, ans = -1;
            while (low <= high) {
                long mid = low + (high - low) /