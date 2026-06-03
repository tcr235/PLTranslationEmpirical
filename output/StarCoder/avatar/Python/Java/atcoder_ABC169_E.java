import java.util.*;

public class Main {
    public static void main(String[] args) {
        resolve();
    }

    public static void resolve() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            low.add(a);
            high.add(b);
        }

        Collections.sort(low);
        Collections.sort(high);

        double result;
        if (n % 2 != 0) {
            result = high.get((n + 1) / 2 - 1) - low.get((n + 1) / 2 - 1) + 1;
        } else {
            double hh = (high.get(n / 2 - 1) + high.get(n / 2)) / 2.0;
            double ll = (low.get(n / 2 - 1) + low.get(n / 2)) / 2.0;
            result = (hh - ll) * 2 + 1;
        }

        System.out.println((int) result);
    }
}