import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int l = Integer.parseInt(input[1]);
        List<String> S = new ArrayList<>();
        for (int a = 0; a < n; a++) {
            S.add(br.readLine());
        }
        Collections.sort(S);
        System.out.println(String.join("", S));
    }
}