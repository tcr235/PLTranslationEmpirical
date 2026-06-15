import java.util.Scanner;

public class atcoder_ABC119_B {

public static void main(String[] args) {

int n = Integer.parseInt(sc.nextLine());

List<Double> x = new ArrayList<>();

for (int i = 0; i < n; i++) {

String str = sc.nextLine();

double value = Double.parseDouble(str.replace("JPY", "* 1.0").replace("BTC", "* 380000.0"));

x.add(value);

}

double sum = Double.sum(x);

System.out.println(sum);

}

}


