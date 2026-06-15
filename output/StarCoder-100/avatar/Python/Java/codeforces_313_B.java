import java.util.Scanner;

public class codeforces_313_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soz = sc.next();
        int[] a = new int[soz.length() + 1];
        for (int i = 1; i < soz.length(); i++) {
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i] += 1;
            }
        }
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            String[] m_l = sc.next().split(" ");
            arr[i] = a[Integer.parseInt(l) - 1] - a[Integer.parseInt(m) - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
