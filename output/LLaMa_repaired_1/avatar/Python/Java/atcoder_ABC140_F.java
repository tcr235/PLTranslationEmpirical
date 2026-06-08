import java.util.*;
import java.io.*;

public class atcoder_ABC140_F {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] S = new int[1000];
        String[] str = br.readLine().split(" ");
        for(int i = 0; i < str.length; i++) {
            S[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(S, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        boolean[] flag = new boolean[str.length];
        Arrays.fill(flag, true);
        int[] cur = new int[1000];
        cur[0] = S[0];
        flag[0] = false;
        int count = 1;
        while(count < N) {
            int j = 0;
            int index = 0;
            for(int k = 0; k < str.length; k++) {
                if(flag[k] && S[k] < cur[j]) {
                    cur[j] = S[k];
                    flag[k] = false;
                    j++;
                    if(j == 1) break;
                }
            }
            if(j == 1) break;
            Arrays.sort(cur, 0, j, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            count++;
        }
        if(count == N) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}