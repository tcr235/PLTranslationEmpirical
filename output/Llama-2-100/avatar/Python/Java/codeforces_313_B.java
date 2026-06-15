import java.util.Scanner;

public class codeforces_313_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            String soz = sc.next();
            int[] a = new int[soz.length() + 1];
            for (int j = 1; j <= soz.length(); j++) {
                a[j] = a[j - 1];
                if (soz.charAt(j - 1) == soz.charAt(j)) {
                    a[j]++;
                }
            }
            arr[i] = a[soz.length()];
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
