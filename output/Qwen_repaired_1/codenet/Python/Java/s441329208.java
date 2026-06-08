import java.util.*;
import java.io.*;

public class s441329208 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().toCharArray();
        Arrays.sort(s);

        String t = new StringBuilder(reader.readLine()).reverse().toString().toCharArray();
        Arrays.sort(t);

        int result = Arrays.compare(s, t);
        System.out.println(result == -1 ? "Yes" : "No");

        reader.close();
    }
}