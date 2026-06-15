import java.util.Scanner;
public class atcoder_ABC172_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = ri();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i * (N / i) * (N / i + 1) / 2;
        }
        System.out.println(ans);
    }
    public static int ri() {
        return Integer.parseInt(sc.nextLine());
    }
    public static int[] rs() {
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }
    public static int[] ri() {
        return Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).toArray(int[]::new);
    }
}


