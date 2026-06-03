import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int t = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        ArrayList<Integer> alocuente = new ArrayList<>(Collections.nCopies(m, 0));
        int ind = 1;
        
        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");
            if (op[0].equals("alloc")) {
                int pos = 0;
                boolean found = false;
                for (int j = 0; j < m && !found; j++) {
                    if (alocuente.get(j) == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            found = true;
                            alocuente.set(j - Integer.parseInt(op[1]) + 1, ind);
                            for (int k = j; k >= j - Integer.parseInt(op[1]) + 1; k--) {
                                alocuente.set(k, ind);
                            }
                            System.out.println(ind);
                            ind++;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (!found) {
                    System.out.println("NULL");
                }
            } else if (op[0].equals("erase")) {
                int arg = Integer.parseInt(op[1]);
                boolean exists = alocuente.contains(arg) && arg > 0;
                if (exists) {
                    int index = alocuente.indexOf(arg);
                    alocuente.set(index, 0);
                } else {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                }
            } else if (op[0].equals("defragment")) {
                int cnt = Collections.frequency(alocuente, 0);
                alocuente.removeAll(Collections.singleton(0));
                while (cnt-- > 0) {
                    alocuente.add(0);
                }
            }
        }
    }
}