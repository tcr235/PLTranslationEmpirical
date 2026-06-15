import java.util.Scanner;

public class s906994739 {

public static void main(String[] args) {

int n = Integer.parseInt(sc.nextLine());

List<List<Integer>> F = new ArrayList<>();
List<List<Integer>> P = new ArrayList<>();

for (int i = 0; i < n; i++) {

List<Integer> temp = new ArrayList<>();

for (int j = 0; j < 10; j++) {

if ((i >> j) & 1 == 1) {

for (int k = 0; k < n; k++) {

temp.add(F[k][j]);

}

}

}

F.add(temp);

}

for (int i = 0; i < n; i++) {

List<Integer> temp = new ArrayList<>();

for (int j = 0; j < 10; j++) {

if ((i >> j) & 1 == 1) {

for (int k = 0; k < n; k++) {

temp.add(P[k][F[k][j]]);

}

}

}

P.add(temp);

}

int ans = -1000000000;

for (int i = 1; i < 2 << 10; i++) {

int tmp = 0;

for (int j = 0; j < 10; j++) {

if ((i >> j) & 1 == 1) {

for (int k = 0; k < n; k++) {

tmp += P[k][lst[k]];

}

}

}

ans = Math.max(ans, tmp);

}

System.out.println(ans);

}

}

}
