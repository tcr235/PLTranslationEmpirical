import java.util.Scanner;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.next();
        int[] a = new int[soz.length() + 1];
        a[0] = 0;
        for (int i = 1; i < soz.length(); i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i]++;
            }
        }
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        for (int i = 0; i < n; i++) {
            String[] inputs = scanner.nextLine().split(" ");
            int m = Integer.parseInt(inputs[0]);
            int l = Integer.parseInt(inputs[1]);
            System.out.println(a[l - 1] - a[m - 1]);
        }
        scanner.close();
    }
}