import java.util.*;
 
public class atcoder_AGC002_B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long N = Integer.parseInt(st.nextToken());
        long M = Integer.parseLong(st.nextToken());
        
        List<long[]> balls = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            balls.add(new long[]{1, 0});
        }
        balls.get(0)[0] = 0;
        balls.get(0)[1] = 1;
        
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            long x = Integer.parseInt(st.nextToken());
            long y = Integer.parseInt(st.nextToken());
            
            long wX = balls.get((int)(x-1))[0];
            long rX = balls.get((int)(x-1))[1];
            long wY = balls.get((int)(y-1))[0];
            long rY = balls.get((int)(y-1))[1];
            
            if (wX >= 1 && rX >= 1) {
                balls.get((int)(x-1))[0]--;
                balls.get((int)(y-1))[1]++;
            } else if (wX == 0) {
                balls.get((int)(x-1))[1]--;
                balls.get((int)(y-1))[1]++;
            } else {
                balls.get((int)(x-1))[0]--;
                balls.get((int)(y-1))[0]++;
            }
        }
        
        long ans = 0;
        for (int i = 0; i < N; i++) {
            if (balls.get(i)[1] > 0) {
                ans++;
            }
        }
        
        System.out.println(ans);
 
    }
}