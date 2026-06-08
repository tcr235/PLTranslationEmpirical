import java.util.*;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(scanner.nextInt());
        }
        lst.sort(Collections.reverseOrder());
        int od = 0;
        for (int i : lst) {
            if ((i & 1) != 0) {
                od++;
            }
        }
        int sum = 0;
        boolean ok = false;
        for (int i = 0; i < n; i++) {
            if (lst.get(i) % 2 == 0) {
                sum += lst.get(i);
            } else {
                if (ok || od > 1) {
                    sum += lst.get(i);
                    od--;
                    ok = !ok;
                }
            }
        }
        System.out.println(sum);
    }
}