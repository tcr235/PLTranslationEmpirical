import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        
        List<Integer> B = new ArrayList<>(List.of(new Integer[N]));
        int count = 1;
        for (Integer i : A) {
            B.set(i - 1, count);
            count += 1;
        }
        
        for (Integer b : B) {
            System.out.print(b + " ");
        }
    }
}