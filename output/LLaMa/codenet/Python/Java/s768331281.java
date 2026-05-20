import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        List<String> S = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String s = scanner.nextLine();
            S.add(s);
        }

        Collections.sort(S);
        String result = String.join("\n", S);
        System.out.println(result);
    }
}