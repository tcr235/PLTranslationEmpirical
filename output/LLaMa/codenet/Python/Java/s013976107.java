import java.util.Scanner;

public class s013976107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);

        String S = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '-') {
                count++;
            }
        }

        if (count == 1 && S.charAt(A) == '-') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}