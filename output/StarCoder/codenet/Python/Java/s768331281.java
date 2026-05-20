import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        int N = Integer.parseInt(line1[0]);
        int L = Integer.parseInt(line1[1]);
        
        List<String> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            S.add(br.readLine().trim());
        }
        
        Collections.sort(S);
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String s : S) {
            bw.write(s);
        }
        bw.newLine();
        bw.flush();
    }
}