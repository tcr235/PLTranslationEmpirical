import java.util.Scanner;

public class s273727373 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        List<Integer> B = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < A.size(); i++) {
            B.set(i, count);
            count++;
        }
        System.out.println(B);
    }
}
