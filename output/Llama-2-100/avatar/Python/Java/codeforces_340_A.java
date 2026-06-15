public class codeforces_340_A {
public static void main(String[] args) {
int x = Integer.parseInt(args[0]);
int y = Integer.parseInt(args[1]);
int a = Integer.parseInt(args[2]);
int b = Integer.parseInt(args[3]);
int lcm = L(x, y);
System.out.println((b - 1) / lcm);
}

public static int L(int x, int y) {
int a = x;
int b = y;
while (a % b != 0) {
    int temp = a;
    a = b;
    b = temp % b;
}
return b;
}
}


