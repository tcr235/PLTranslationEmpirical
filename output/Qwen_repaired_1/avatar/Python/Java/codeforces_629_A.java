import java.util.Scanner;

public class codeforces_629_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] cake = new char[n][n];
        double happiness = 0;
        int chocCount = 0;

        for (int i = 0; i < n; i++) {
            cake[i] = scanner.next().toCharArray();
            for (char j : cake[i]) {
                if (j == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                hap(chocCount, happiness, nfat);
            }
            chocCount = 0;
            nfat = 1;
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (cake[i][j] == 'C') {
                    chocCount++;
                }
            }
            if (chocCount > 1) {
                hap(chocCount, happiness, nfat);
            }
            chocCount = 0;
            nfat = 1;
        }

        System.out.println((int)happiness);
    }

    private static void hap(int count, double hap, long fact){
        for(int q=count;q>=count-2&&q>1;q--){
            fact*=q;
        }
        hap+=fact/2;
        happiness=hap;
    }
}