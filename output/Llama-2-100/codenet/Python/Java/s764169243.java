import java.util.Scanner;

public class s764169243 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int[] ans = new int[N];
        SegmentTree left = new SegmentTree(N, 0);
        for (int i = 0; i < N; i++) {
            int num = a[i];
            ans[num - 1] = i + 1;
            left.update(num - 1, i + 1);
        }
        SegmentTree right = new SegmentTree(N, 0);
        for (int i = N - 1; i >= 0; i--) {
            int num = a[i];
            ans[num - 1] = i + 1;
            right.update(num - 1, i + 1);
        }
        System.out.println(Arrays.toString(ans));
    }

    public static class SegmentTree {

        public static int[] query(int p, int q) {
            if (q <= p) {
                return new int[0];
            }
            int p_size = (p - 1) / 2;
            int q_size = (q - 1) / 2;
            int[] ret = new int[q_size - p_size + 1];
            for (int i = 0; i < q_size - p_size + 1; i++) {
                ret[i] = query(p + i, q - i).stream().map(x -> x * (i + 1)).findFirst().orElse(0);
            }
            return ret;
        }

        public static void update(int k, int x) {
            k += size - 1;
            seg[k] = x;
            while (k > 0) {
                k = (k - 1) / 2;
                seg[k] = query(2 * k + 1, 2 * k + 2).stream().map(x -> x * (k + 1)).findFirst().orElse(0);
            }
        }

        public static int[] segfunc(int p, int q) {
            if (q <= p) {
                return new int[0];
            }
            int p_size = (p - 1) / 2;
            int q_size = (q - 1) / 2;
            int[] ret = new int[q_size - p_size + 1];
            for (int i = 0; i < q_size - p_size + 1; i++) {
                ret[i] = segfunc(p + i, q - i).stream().map(x -> x * (i + 1)).findFirst().orElse(0);
            }
            return ret;
        }

        public static void segPrint() {
            System.out.println(Arrays.toString(seg));
        }

        private int size;
        private int[] seg;

        public SegmentTree(int size, int defaultValue) {
            this.size = size;
            this.seg = new int[2 * size - 1];
            for (int i = 0; i < 2 * size - 1; i++) {
                seg[i] = defaultValue;
            }
        }

        public void update(int k, int x) {
            k += size - 1;
            seg[k] = x;
            while (k > 0) {
                k = (k - 1) / 2;
                seg[k] = query(2 * k + 1, 2 * k + 2).stream().map(x -> x * (k + 1)).findFirst().orElse(0);
            }
        }

        public int[] query(int p, int q) {
            if (q <= p) {
                return new int[0];
            }
            int p_size = (p - 1) / 2;
            int q_size = (q - 1) / 2;
            int[] ret = new int[q_size - p_size + 1];
            for (int i = 0; i < q_size - p_size + 1; i++) {
                ret[i] = query(p + i, q - i).stream().map(x -> x * (i + 1)).findFirst().orElse(0);
            }
            return ret;
        }
    }
}
