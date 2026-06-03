import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        String[] m = scanner.nextLine().split(" ");
        boolean possible = true;
        Set<String> unique = new HashSet<>(Arrays.asList(m));
        for (String i : unique) {
            int count = 0;
            for (String j : m) {
                if (i.equals(j)) {
                    count++;
                }
            }
            if (count >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}