```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);

        int[] sR = new int[N];
        int[] sC = new int[N];
        int sRIndex = 0;
        int sCIndex = 0;

        int[] tR = new int[N];
        int[] tC = new int[N];
        int tRIndex = 0;
        int tCIndex = 0;

        String S = scanner.nextLine();
        String T = scanner.nextLine();

        boolean judge = false;

        int[] sLeft = new int[1];
        int[] sRight = new int[1];
        int[] sUp = new int[1];
        int[] sDown = new int[1];

        int[] tLeft = new int[1];
        int[] tRight = new int[1];
        int[] tUp = new int[1];
        int[] tDown = new int[1];

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'L') {
                sLeft[0] += 1;
                if (sLeft[0] - tRight[0] - sCIndex == 0) {
                    judge = true;
                }
            } else if (S.charAt(i) == 'R') {
                sRight[0] += 1;
                if (sCIndex + (sRight[0] - tLeft[0]) == W + 1) {
                    judge = true;
                }
            } else if (S.charAt(i) == 'U') {
                sUp[0] += 1;
                if (sUp[0] - tDown[0] - sRIndex == 0) {
                    judge = true;
                }
            } else if (S.charAt(i) == 'D') {
                sDown[0] += 1;
                if (sRIndex + (sDown[0] - tUp[0]) == H + 1) {
                    judge = true;
                }
            }

            if (T.charAt(i) == 'L') {
                if (sCIndex