import java.util.ArrayList;
import java.util.List;

public class s827462150 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] A = new int[n];

        int x = 1;
        int y = 1;
        int z = 1;

        while (x * x + y * y + z * z + x * y + y * z + z * x <= n) {
            int i = x * x + y * y + z * z + x * y + y * z + z * x;
            A[i - 1]++;
            z++;
            if (z == n) {
                break;
            }
            y++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
