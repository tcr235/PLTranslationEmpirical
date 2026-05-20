```java
import java.util.*;

public class Main {
    static class SegmentTree {
        int size, defaultVal;
        long[] seg;

        public SegmentTree(int size, long defaultVal) {
            this.size = 1 << (32 - Integer.numberOfLeadingZeros(size - 1));
            this.defaultVal = defaultVal;
            this.seg = new long[2 * this.size - 1];
            Arrays.fill(seg, defaultVal);
        }

        public void update(int k, long x) {
            k += size - 1;
            seg[k] = x;
            k >>= 1;
            while (k > 0) {
                seg[k] = Math.max(seg[2 * k + 1], seg[2 * k + 2]);
                k >>= 1;
            }
        }

        public long query(int p, int q) {
            if (q <= p) return defaultVal;
            p += size - 1;
            q += size - 1;
            long ret = 0;
            while (q - p > 1) {
                if (p % 2 == 0) {
                    ret = Math.max(ret, seg[p]);
                }
                if (q % 2 == 1) {
                    ret = Math.max(ret, seg[q]);
                    q--;
                }
                p >>= 1;
                q >>= 1;
            }
            ret = Math.max(ret, seg[p]);
            ret = Math.max(ret, seg[q]);
            return ret;
        }

        public void printSeg() {
            System.out.println(Arrays.toString(seg));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        long[] ans = new long[N];
        Arrays.fill(ans, 1);
        SegmentTree leftSeg = new SegmentTree(N, 0);
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            ans[a[i] - 1] *= (i + 1) - leftSeg.query(0, a[i]);
            leftSeg.update(a[i] - 1, i + 1);
        }
        SegmentTree rightSeg = new SegmentTree(N, 0);
        for (int i = N - 1; i >= 0; i--) {
            ans[a[i] - 1