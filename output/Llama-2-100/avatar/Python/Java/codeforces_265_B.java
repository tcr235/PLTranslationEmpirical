import java.util.Scanner;

public class codeforces_265_B {

public static void main(String[] args) {

int n = Integer.parseInt(sc.nextLine());
List<Integer> l = new ArrayList<>();

for (int i = 0; i < n; i++) {
    l.add(Integer.parseInt(sc.nextLine()));
}

int ans = n - 1;
int last = 0;

for (int i : l) {
    ans += Math.abs(last - i) + 1;
    last = i;
}

System.out.println(ans);

}

}
