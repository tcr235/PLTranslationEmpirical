import java.util.Scanner;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (String x : scanner.split(" ")) {
            list.add(Integer.parseInt(x) % 2);
        }
        if (list.stream().reduce(0, (a, b) -> a + b).orElse(0) == 1) {
            System.out.println(list.indexOf(1) + 1);
        } else {
            System.out.println(list.indexOf(0) + 1);
        }
    }
}


