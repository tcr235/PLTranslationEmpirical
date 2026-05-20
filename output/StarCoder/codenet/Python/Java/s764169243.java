```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] a = new int[N];
        for(int i = 0; i < N; ++i){
            a[i] = Integer.parseInt(st.nextToken());
            a[i]--;
        }
        
        long[] ans = new long[N];
        for(int i = 0; i < N; ++i)
            ans[i] = i + 1;
        
        SegmentTree leftSeg = new SegmentTree(N);
        for(int i = 0; i < N; ++i){
            ans[a[i]] *= i - leftSeg.query(0, a[i] + 1);
            leftSeg.add(a[i], i + 1);
        }

        SegmentTree rightSeg = new SegmentTree(N);
        for(int i = 0; i < N; ++i){
            ans[a[N - i - 1]] *= i - rightSeg.query(0, a[N - i - 1] + 1);
            rightSeg.add(a[N - i - 1], i + 1);
        }

        long sum = 0;
        for(long v : ans)
            sum += v;
        System.out.println(sum);

    }

    static class SegmentTree{

        private int[] tree;
        private int n;
        private static final int INF = (int)1e9;

        SegmentTree(int n){
            this.n = n;
            tree = new int[2 * n - 1];
            Arrays.fill(tree, INF - 1);
        }

        void add(int k, int x){
            k += n - 1;
            while(k > 0){
                k = (k - 1) / 2;
                tree[k] = Math.max(tree[2 * k + 1], tree[2 * k + 2]);
            }
        }

        int query(int p, int q){
            if(q <= p)
                return INF - 1;
            
            p += n - 1;
            q += n - 2;
            int result = INF - 1;
            while(q - p > 1){
                if((