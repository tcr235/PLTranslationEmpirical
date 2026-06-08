import java.util.*;
import java.util.stream.Collectors;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int t = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        List<Integer> alocuente = IntStream.range(0, m).mapToObj(i -> 0).collect(Collectors.toList());
        int ind = 1;
        
        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");
            if ("alloc".equals(op[0])) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente.get(j) == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            alocuente.subList(j - Integer.parseInt(op[1]) + 1, j + 1).replaceAll(val -> ind);
                            System.out.println(ind);
                            ind++;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (!alocuente.contains(ind)) {
                    System.out.println("NULL");
                }
            } else if ("erase".equals(op[0])) {
                int arg = Integer.parseInt(op[1]);
                if (arg <= 0 || !alocuente.contains(arg)) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    int index = alocuente.lastIndexOf(arg);
                    alocuente.remove(index);
                }
            } else if ("defragment".equals(op[0])) {
                int cnt = Collections.frequency(alocuente, 0);
                alocuente.retainAll(Collections.singletonList(0));
                Collections.addAll(alocuente, Collections.nCopies(cnt, 0).toArray(new Integer[0]));
            }
        }
    }
}