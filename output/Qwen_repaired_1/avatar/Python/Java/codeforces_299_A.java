import java.util.*;
import java.io.*;

public class codeforces_299_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        
        Arrays.sort(arr);
        int minElement = arr[0];
        boolean allDivisibleByMin = true;
        
        for (int x : arr) {
            if (x % minElement != 0) {
                allDivisibleByMin = false;
                break;
            }
        }
        
        System.out.println(allDivisibleByMin ? arr[4] : minElement);
    }
}