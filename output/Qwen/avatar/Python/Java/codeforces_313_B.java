import java.util.Scanner;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int[] a = new int[soz.length() + 1];
        for (int i = 1; i < soz.length(); i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i]++;
            }
        }
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] inputs = scanner.nextLine().split(" ");
            int m = Integer.parseInt(inputs[0]) - 1;
            int l = Integer.parseInt(inputs[1]) - 1;
            result.append(a[l] - a[m]).append("\n");
        }
        System.out.println(result.toString());
        scanner.close();
    }
}