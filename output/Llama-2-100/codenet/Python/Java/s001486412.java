import java.util.Scanner;

public class s001486412 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        double below = 0;
        for (int i = 0; i < n; i++) {
            below += 1 / a.get(i);
        }
        System.out.println(1 / below);
    }
}
