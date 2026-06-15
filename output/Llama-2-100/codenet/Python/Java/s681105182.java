import java.util.Scanner;

public class s681105182 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a_li = new int[n];

        for (int i = 0; i < n; i++) {
            a_li[i] = sc.nextInt();
        }

        Arrays.sort(a_li);

        int n = a_li[a_li.length - 1];
        int dif = Integer.MAX_VALUE;
        int prev_dif = dif;
        for (int a : a_li) {
            dif = Math.min(Math.abs(n / 2 - a), dif);
            if (dif != prev_dif) {
                int r = a;
                prev_dif = dif;
            }
        }

        System.out.println(n, r);
    }
}
