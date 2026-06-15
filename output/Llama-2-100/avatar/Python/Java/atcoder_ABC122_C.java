import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.nextLine();
        List<List<Integer>> problems = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(sc.nextInt());
            temp.add(sc.nextInt());
            problems.add(temp);
        }
        
        int[] cumsum = new int[n + 1];
        cumsum[0] = 0;
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.charAt(i - 1) == 'A' || s.charAt(i - 1) == 'C');
        }
        
        for (int l = 0; l < q; l++) {
            int r = problems.get(l).get(1);
            System.out.print(cumsum[r] - cumsum[problems.get(l).get(0)] + " ");
        }
    }
}


