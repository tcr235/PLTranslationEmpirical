import java.util.Scanner;

public class codeforces_621_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            lst.add(Integer.parseInt(str.split(" ")[0]));
        }
        Collections.sort(lst);
        Collections.reverse(lst);
        int od = 0;
        for (int i = 0; i < n; i++) {
            if (lst.get(i) & 1 == 1) {
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


