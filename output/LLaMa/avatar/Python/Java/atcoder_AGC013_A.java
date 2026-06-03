import java.io.*;
import java.util.*;

public class atcoder_AGC013_A {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static int input() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    static int[] LIST() throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    static int INT() throws IOException {
        return Integer.parseInt(input());
    }

    public static void main(String[] args) throws IOException {
        int N = INT();
        int[] A = LIST();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (i == 0 || A[i] != A[i - 1]) {
                list.add(A[i]);
            }
        }
        int N1 = list.size();
        int ans = 0;
        for (int i = 1; i < N1 - 1; i++) {
            if (Math.min(list.get(i - 1), list.get(i + 1)) < list.get(i) || Math.max(list.get(i - 1), list.get(i + 1)) > list.get(i)) {
                ans++;
            }
        }
        bw.write((ans + 1) + "\n");
        bw.flush();
    }
}