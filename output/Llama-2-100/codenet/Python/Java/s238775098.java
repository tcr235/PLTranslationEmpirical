import java.util.Scanner;

public class s238775098 {

public static void main(String[] args) {

int n = Integer.parseInt(sc.nextLine());

int res = 0;

for (int i = 0; i < n; i++) {

String x = sc.nextLine();
String u = sc.nextLine();

if (u.equals("BTC")) {

res += (float) x * 380000;

} else {

res += Integer.parseInt(x);

}

}

System.out.println(res);

}

}
