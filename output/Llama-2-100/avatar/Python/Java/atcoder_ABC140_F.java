import java.util.Scanner;
public class atcoder_ABC140_F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        boolean[] flag = new boolean[arr.length];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            if (flag[i] && arr[i] < arr[cur]) {
                cur++;
                flag[i] = false;
            }
        }
        if (cur == arr.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


