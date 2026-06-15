import java.util.Scanner;

public class codeforces_296_A {

public static void main(String[] args) {

int n = Integer.parseInt(sc.nextLine());
String[] m = sc.nextLine().split(" ");
boolean possible = true;

for (int i : m) {

if (m.contains(i) && m.count(i) >= n / 2 + 1) {

possible = false;
break;
}
}

System.out.println("YES" + (possible ? " " : " NO"));

}

}
