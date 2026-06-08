import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        String a = parts[0];
        String b = parts[1];
        int x = Math.max(a.length(), b.length());

        a = String.format("%" + x + "s", a).replace(' ', '0');
        b = String.format("%" + x + "s", b).replace(' ', '0');

        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < x; i++) {
            int d = Character.getNumericValue(a.charAt(x - i - 1)) + Character.getNumericValue(b.charAt(i)) + carry;
            if (d > 9) {
                result.append(d % 10);
                carry = 1;
            } else {
                result.append(d);
                carry = 0;
            }
        }

        if (carry == 1) {
            result.append(1);
        }

        System.out.println(Integer.parseInt(result.reverse().toString()));
    }
}