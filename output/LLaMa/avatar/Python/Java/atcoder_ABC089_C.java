```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static final long MOD = (long) (1e9 + 7);
    static final long INF = (long) (1e18);
    static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }

        String[] march = {"M", "A", "R", "C", "H"};
        int[] marchLis = new int[5];

        for (String s : S) {
            for (int i = 0; i < march.length; i++) {
                if (Character.toUpperCase(s.charAt(0)) == march[i].charAt(0)) {
                    marchLis[i]++;
                    break;
                }
            }
        }

        long ans = 0;
        for (int x : getCombinations(marchLis, 3)) {
            ans += x;
        }

        System.out.println(ans);
    }

    static int[] getCombinations(int[] array, int r) {
        if (r == 0) return new int[0];
        int n = array.length;
        int[] result = new int[n - r + 1];
        result[0] = getPermutation(array, 0, n - 1, r);
        return result;
    }

    static int getPermutation(int[] array, int l, int r, int k) {
        if (k == 1) return array[l];
        int pivot = partition(array, l, r);
        if (pivot == l + k) return array[l + k];
        else if (pivot < l + k) return getPermutation(array, pivot + 1, r, k - (pivot - l + 1));
        else return getPermutation(array, l, pivot - 1, k);
    }

    static int partition(int[] array, int l, int r) {
        int pivot = array[r];
        int i = l - 1;
        for (int j = l; j < r;