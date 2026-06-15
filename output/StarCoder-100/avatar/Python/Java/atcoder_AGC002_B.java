import java.util.*;
import java.io.*;

public class atcoder_AGC002_B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] balls = new int[n];
        for(int i = 0; i < n; i++) {
            balls[i] = in.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(balls[i] == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

