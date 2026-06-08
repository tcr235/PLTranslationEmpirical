import java.util.Scanner;

public class codeforces_629_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        String[] cake = new String[n];
        int happiness = 0;
        int chocCount = 0;
        double nfat = 1.0;

        for (int i = 0; i < n; i++) {
            cake[i] = scanner.nextLine();
            for (char c : cake[i].toCharArray()) {
                if (c == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                double temp = nfat;
                for (int i1 = chocCount; i1 > chocCount - 2; i1--) {
                    nfat *= i1;
                }
                happiness += nfat / 2;
            }
            nfat = 1.0;
            chocCount = 0;
        }

        int chocCount1 = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i].charAt(j) == 'C') {
                    chocCount1++;
                }
            }
            if (chocCount1 > 1) {
                double temp = nfat;
                for (int i1 = chocCount1; i1 > chocCount1 - 2; i1--) {
                    nfat *= i1;
                }
                happiness += nfat / 2;
            }
            nfat = 1.0;
            chocCount1 = 0;
        }

        System.out.println((int) happiness);
    }
}