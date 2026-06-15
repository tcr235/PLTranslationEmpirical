import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC150_C {

public static void main(String[] args) {

int n = Integer.parseInt(sc.nextLine());
List<List<Integer>> orig = new ArrayList<>();
List<Integer> p = new ArrayList<>();
List<Integer> q = new ArrayList<>();

sc.nextLine(); // ignore the first line

for (int i = 1; i <= n; i++) {
p.add(i);
q.add(i);
}

 orig.add(p);
orig.add(q);

int pn = orig.indexOf(p);
int qn = orig.indexOf(q);

System.out.println(Math.abs(pn - qn));

}

}
