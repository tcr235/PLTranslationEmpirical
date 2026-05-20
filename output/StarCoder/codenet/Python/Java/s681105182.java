import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a_li[] = new int[N];
        for(int i = 0; i < N; i++) {
            a_li[i] = scanner.nextInt();
        }

        Arrays.sort(a_li);

        int n = a_li[N-1];
        
        long dif = (long)1e18;
        long prev_dif = dif;
        for(int a : a_li) {
            if (a == n) continue;
            long currentDif = Math.min(Math.abs(n/2L - a), dif);
            if (currentDif != prev_dif) {
                int r = a;
                prev_dif = currentDif;
            }
            dif = currentDif;
        }

        System.out.println(n + " " + r % 1000000007);
        scanner.close();
    }
}