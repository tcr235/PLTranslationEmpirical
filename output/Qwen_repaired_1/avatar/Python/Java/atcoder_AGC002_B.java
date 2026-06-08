import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC002_B {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        
        long N = Long.parseLong(line[0]);
        long M = Long.parseLong(line[1]);
        
        List<long[]> balls = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            balls.add(new long[]{1, 0});
        }
        balls.get(0)[0] = 0;
        balls.get(0)[1] = 1;
        
        for (int i = 0; i < M; i++) {
            line = br.readLine().split(" ");
            long x = Long.parseLong(line[0]);
            long y = Long.parseLong(line[1]);
            
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