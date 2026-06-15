import java.util.*;
public class s538657784 {
    public static void main(String[] args) {
        int N = Integer.parseInt(sc.nextLine());
        int sqN = (int)Math.sqrt(N);
        for (int i = 0; i < sqN; i++) {
            if (N % (sqN - i) == 0) {
                int result = N / (sqN - i) + sqN - i;
                if (result > 2) {
                    System.out.println(result);
                    break;
                }
            }
        }
    }
}
