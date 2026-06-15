import java.util.Scanner;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] n = sc.nextLine().split(" ");
        int[] arr = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            arr[i] = Integer.parseInt(n[i]);
        }
        int a = 1;
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (arr[pos] > arr[i]) {
                a++;
                pos = i;
            }
        }
        System.out.println(a);
    }
}
