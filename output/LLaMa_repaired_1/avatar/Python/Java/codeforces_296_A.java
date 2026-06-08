import java.util.*;

public class codeforces_296_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        String m = scanner.nextLine();
        boolean possible = true;
        String[] word = m.split(" ");
        Set<String> unique = new HashSet<>(Arrays.asList(word));
        for (String i : unique) {
            int count = 0;
            for (String j : word) {
                if (i.equals(j)) {
                    count++;
                }
            }
            if (count >= n / 2 + 1) {
                possible = true;
                break;
            } else if (count >= n / 2) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "YES" : "NO");
    }
}