import java.util.Scanner;

public class codeforces_459_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] l1 = scanner.nextLine().split(" ");
        Arrays.sort(l1);
        int a = l1[-1];
        int b = l1[0];
        if (a == b) {
            System.out.println(a - b + (n * (n - 1)) / 2);
        } else {
            int ac = Arrays.asList(l1).indexOf(a);
            int bc = Arrays.asList(l1).indexOf(b);
            System.out.println(a - b + ac * bc);
        }
    }
}
