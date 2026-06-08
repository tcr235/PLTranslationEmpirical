```java
import java.util.Scanner;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);

        int[] sRC = new int[N];
        int[] sCC = new int[N];
        int sRCur = 0;
        int sCCur = 0;

        int[] tRC = new int[N];
        int[] tCC = new int[N];
        int tRCur = 0;
        int tCCur = 0;

        String S = scanner.nextLine();
        String T = scanner.nextLine();

        boolean judge = false;

        int sL = 0;
        int sR = 0;
        int sU = 0;
        int sD = 0;

        int tL = 0;
        int tR = 0;
        int tU = 0;
        int tD = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'L') {
                sL += 1;
                if (sL - tR - sCCur == 0) {
                    judge = true;
                }
            } else if (S.charAt(i) == 'R') {
                sR += 1;
                if (sCCur + (sR - tL) == W + 1) {
                    judge = true;
                }
            } else if (S.charAt(i) == 'U') {
                sU += 1;
                if (sU - tD - sRCur == 0) {
                    judge = true;
                }
            } else if (S.charAt(i) == 'D') {
                sD += 1;
                if (sRCur + (sD - tU) == H + 1) {
                    judge = true;
                }
            }

            if (T.charAt(i) == 'L') {
                if (sCCur != (tL - (sR != tR ? sR : 0))) {
                    tL += 1;
                }
            }
            if (T.charAt(i) == 'R') {
                if (sCCur != (W + (tR - (s