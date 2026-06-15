import java.util.*;
public class atcoder_ABC123_D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[x];
        int[] b = new int[y];
        int[] c = new int[z];
        for(int i = 0; i < x; i++) {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < y; i++) {
            b[i] = in.nextInt();
        }
        for(int i = 0; i < z; i++) {
            c[i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int[] ab = new int[x * y];
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                ab[i * y + j] = a[i] + b[j];
            }
        }
        Arrays.sort(ab);
        int[] abc = new int[k];
        for(int i = 0; i < k; i++) {
            for(int j = 0; j < z; j++) {
                abc[i] = ab[i] + c[j];
            }
        }
        Arrays.sort(abc);
        for(int i = 0; i < k; i++) {
            System.out.println(abc[i]);
        }
    }
}
