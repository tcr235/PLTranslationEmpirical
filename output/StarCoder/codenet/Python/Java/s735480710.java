import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> a = Arrays.asList(scanner.next().split(" "));
        List<String> b = new ArrayList<>(a.size());
        
        for (int i = 1; i < a.size(); i += 2) {
            b.add(0, a.get(i));
        }
        if (a.size() % 2 == 0) {
            System.out.println(String.join(" ", b));
        } else {
            Collections.reverse(b);
            System.out.println(String.join(" ", b));
        }
    }
}