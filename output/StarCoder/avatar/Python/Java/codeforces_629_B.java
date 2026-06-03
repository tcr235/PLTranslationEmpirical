import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String str = scanner.nextLine();
            char x = str.charAt(0);
            int a = Integer.parseInt(str.substring(2, 4));
            int b = Integer.parseInt(str.substring(5)) + 1;
            
            if (x == 'M') {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }

        int a = 0, b = 0, c = 0;
        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            c = Math.max(c, Math.min(a, b));
        }
        
        System.out.println(c);
        scanner.close();
    }
}