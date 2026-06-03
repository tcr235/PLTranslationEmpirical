import java.util.Scanner;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] t = new String[4][4];

        for (int i = 0; i < 4; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < 4; j++) {
                t[i][j] = String.valueOf(input.charAt(j));
            }
        }

        int black = 0;
        int white = 0;
        boolean correct = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j].equals("#")) {
                    black++;
                } else {
                    white++;
                }
                if (j < 3 && t[i][j + 1].equals("#")) {
                    black++;
                } else if (j < 3) {
                    white++;
                }

                if (i < 3 && t[i + 1][j].equals("#")) {
                    black++;
                } else if (i < 3) {
                    white++;
                }

                if (i < 3 && j < 3 && t[i + 1][j + 1].equals("#")) {
                    black++;
                } else if (i < 3 && j < 3) {
                    white++;
                }

                if ((black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4)) {
                    correct = true;
                    break;
                }
                black = 0;
                white = 0;
                if (correct) {
                    break;
                }
            }
            if (correct) {
                break;
            }
        }

        if (correct) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}