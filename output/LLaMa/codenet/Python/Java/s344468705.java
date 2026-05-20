import java.io.*;
import java.util.*;

public class Main {

    public static class FastReader {
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

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int T = sc.nextInt();
        if(T == 1) {
            solve(sc);
        } else {
            for(int i=0; i<T; i++) {
                solve(sc);
            }
        }
    }

    public static void solve(FastReader sc) {
        int n = sc.nextInt();
        int[] dp = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++) {
            int num = -sc.nextInt();
            num = -num;
            if(num >= max) {
                dp[i] = num;
                max = Math.max(max, num);
            } else {
                int idx = upperBound(dp, num);
                dp[idx] = num;
            }
        }

        System.out.println(dp.length);
    }

    public static int upperBound(int[] arr, int num) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}