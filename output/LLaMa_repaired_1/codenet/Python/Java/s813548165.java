import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s813548165 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String S = reader.readLine();
        String T = reader.readLine();

        StringBuilder charList = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            charList.append(S.charAt(i));
            charList.append(T.charAt(i));
        }

        System.out.println(charList.toString());
    }
}