import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(inputs[0]);
        int y = Integer.parseInt(inputs[1]);
        int z = Integer.parseInt(inputs[2]);
        int k = Integer.parseInt(inputs[3]);

        ArrayList<Integer> a = new ArrayList<>();
        String[] lineA = scanner.nextLine().split(" ");
        for (String num : lineA) {
            a.add(Integer.parseInt(num));
        }

        ArrayList<Integer> b = new ArrayList<>();
        String[] lineB = scanner.nextLine().split(" ");
        for (String num : lineB) {
            b.add(Integer.parseInt(num));
        }

        ArrayList<Integer> c = new ArrayList<>();
        String[] lineC = scanner.nextLine().split(" ");
        for (String num : lineC) {
            c.add(Integer.parseInt(num));
        }

        ArrayList<Integer> ab = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab.add(a.get(i) + b.get(j));
            }
        }
        Collections.sort(ab, Collections.reverseOrder());

        ArrayList<Integer> abc = new ArrayList<>();
        int limit = Math.min(k, x * y);
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < z; j++) {
                abc.add(ab.get(i) + c.get(j));
            }
        }
        Collections.sort(abc, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            System.out.println(abc.get(i));
        }
    }
}