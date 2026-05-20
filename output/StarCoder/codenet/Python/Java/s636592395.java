import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(scanner.nextInt());
        }
        
        Collections.sort(A);
        int ans = A.get(N-1) - A.get(0);
        System.out.println(ans);
    }
}