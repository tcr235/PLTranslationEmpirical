import java.util.Scanner;

public class s557080041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 0) {
            System.out.println("Yes");
        } else {
            String strN = String.valueOf(N);
            List<Integer> L = new ArrayList<>();
            for (String s : strN.split("")) {
                L.add(Integer.parseInt(s));
            }
            int X = 0;
            for (int i : L) {
                X += i;
            }
            if (X % 9 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
