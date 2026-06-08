import java.io.*;
import java.util.*;

public class atcoder_AGC013_A {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int input() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    static int[] LIST() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = st.countTokens();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        int N = input();
        int[] A = LIST();
        List<Integer> listA = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if (i == 0 || A[i] != A[i - 1]) {
                listA.add(A[i]);
            }
        }

        int N1 = listA.size();
        int ans = 0;

        for (int i = 1; i < N1 - 1; i++) {
            if ((Math.min(listA.get(i - 1), listA.get(i + 1)) < listA.get(i) && 
                 listA.get(i) > listA.get(i + 1)) || (Math.max(listA.get(i - 1), listA.get(i + 1)) > listA.get(i) && 
                 listA.get(i) < listA.get(i + 1))) {
                ans++;
            }
        }

        bw.write((ans + 1) + "\n");
        bw.flush();
    }
}