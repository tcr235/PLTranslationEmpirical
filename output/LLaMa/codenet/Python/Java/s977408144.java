```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static BufferedReader br;
    static PrintWriter pw;
    static String[] input;
    static int mod = (int) 1e9 + 7;
    static int INF = (int) 1e20;
    static int[][] dp;
    static ArrayList<ArrayList<Integer>> adj;

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static class Pair {
        long first;
        long second;

        public Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }
    }

    static class Triple {
        long first;
        long second;
        long third;

        public Triple(long first, long second, long third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

    static long power(long a, long b) {
        long temp;
        if (b == 0) {
            return 1;
        }
        temp = power(a, b / 2);
        if (b % 2 == 0) {
            return (temp * temp) % mod;
        } else {
            return (((temp * temp) % mod) * a) % mod;
        }
    }

    static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static long hani(long x, long min_, long max_) {
        return Math.min(Math.max(x, min_), max_);
    }

    static long getM(long a) {
        return mod - mod / a;
    }

    static long inverse(long x) {
        return power(x, getM(mod));
    }

    static long lcm(long a, long b) {
        return (a * b)