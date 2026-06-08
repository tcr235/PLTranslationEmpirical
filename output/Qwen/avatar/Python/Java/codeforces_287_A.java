import java.util.*;

public class codeforces_287_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<List<String>> t = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String line = scanner.nextLine();
            List<String> list = Arrays.asList(line.split(""));
            t.add(list);
        }
        int black = 0;
        int white = 0;
        int correct = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ("#".equals(t.get(i).get(j))) {
                    black++;
                } else {
                    white++;
                }
                if (j + 1 < 4 && "#".equals(t.get(i).get(j + 1))) {
                    black++;
                } else if (j + 1 < 4) {
                    white++;
                }
                if (i + 1 < 4 && "#".equals(t.get(i + 1).get(j))) {
                    black++;
                } else if (i + 1 < 4) {
                    white++;
                }
                if (i + 1 < 4 && j + 1 < 4 && "#".equals(t.get(i + 1).get(j + 1))) {
                    black++;
                } else if (i + 1 < 4 && j + 1 < 4) {
                    white++;
                }
                if ((black == 0 || black == 3 || white == 0 || white == 3 || white == 4 || black == 4)) {
                    correct = 1;
                    break;
                }
                black = 0;
                white = 0;
            }
            if (correct == 1) {
                break;
            }
        }
        if (correct == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}