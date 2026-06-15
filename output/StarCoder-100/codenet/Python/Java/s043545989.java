import java.util.*;
public class s043545989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[3];
        int[] c = new int[2];
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                b[0]++;
            } else if (a[i] == 1) {
                b[1]++;
            } else {
                b[2]++;
            }
        }
        if (b[0] == 3) {
            System.out.println("Yes");
        } else if (b[0] == 2 && b[1] == 1) {
            System.out.println("Yes");
        } else if (b[0] == 1 && b[1] == 2) {
            System.out.println("Yes");
        } else if (b[0] == 1 && b[1] == 1 && b[2] == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
