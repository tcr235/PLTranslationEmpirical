public class codeforces_387_A {

public static void main(String[] args) {

String input = "13:45";

int h1, m1;
String[] split = input.split(":");
h1 = Integer.parseInt(split[0]);
m1 = Integer.parseInt(split[1]);

int h2, m2;
split = input.split(":");
h2 = Integer.parseInt(split[0]);
m2 = Integer.parseInt(split[1]);

int m2_new = (h2 * 60) + m2;
int m1_new = (h1 * 60) + m1;
int diff = m1_new - m2_new;

diff = diff % 1440;

String output = String.format("%02d:%02d", diff // 60, diff % 60);

System.out.println(output);

}

}


