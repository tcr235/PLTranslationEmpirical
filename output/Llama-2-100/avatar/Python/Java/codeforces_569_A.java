import java.util.Scanner;

public class codeforces_569_A {

public static void main(String[] args) {

int t, s, q;

t = Integer.parseInt(sc.nextLine().split(" ")[0]);
s = Integer.parseInt(sc.nextLine().split(" ")[1]);
q = Integer.parseInt(sc.nextLine().split(" ")[2]);

int ans = 0;

while (s < t) {

    s *= q;
    ans++;

}

System.out.println(ans);

}

}
