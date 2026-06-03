import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        int i = scanner.nextInt();
        while (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            int x = input[0].equals("M") ? 1 : 0;
            int a = Integer.parseInt(input[1]) - 1;
            int b = Integer.parseInt(input[2]);
            m[a] += x * 2;
            m[b] -= x * 2;
            f[a] += (1 - x) * 2;
            f[b] -= (1 - x) * 2;
        }
        int a = 0, b = 0, c = 0;
        for (int j = 0; j < N; j++) {
            a += m[j];
            b += f[j];
            c = Math.min(a, b) > c ? Math.min(a, b) : c;
        }
        System.out.println(c);
    }
}