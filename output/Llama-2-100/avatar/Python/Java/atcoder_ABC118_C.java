import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import static java.lang.Math.gcd;

public class atcoder_ABC118_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            A.add(Integer.parseInt(s));
        }
        List<Integer> list = new ArrayList<>();
        functools.reduce(fractions.gcd, list, A);
        System.out.println(gcd(list));
    }
}
