import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> res = new HashSet<>();

        for (int i = 0; i < n; i++) {
            res.add(scanner.nextLine());
        }

        System.out.println(res.size());
    }
}