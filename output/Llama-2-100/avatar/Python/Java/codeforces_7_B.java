import java.util.Scanner;

public class codeforces_7_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        int[] alocuente = new int[m];
        int ind = 1;
        for (int i = 0; i < t; i++) {
            String op = sc.nextLine();
            if (op.equals("alloc")) {
                int pos = 0;
                for (int j = 0; j < m; j++) {
                    if (alocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op.split(" ")[1])) {
                            int start = j - Integer.parseInt(op.split(" ")[1]) + 1;
                            int end = j + 1;
                            alocuente[start:end] = new int[Integer.parseInt(op.split(" ")[1])];
                            for (int k = 0; k < Integer.parseInt(op.split(" ")[1]); k++) {
                                alocuente[start + k] = ind;
                                ind++;
                            }
                            System.out.println(ind);
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                } else {
                    System.out.println("NULL");
                }
            } else if (op.equals("erase")) {
                int pos = 0;
                if (Integer.parseInt(op.split(" ")[1]) == 0 || !alocuente.contains(Integer.parseInt(op.split(" ")[1]))) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (alocuente[j] == Integer.parseInt(op.split(" ")[1]) && Integer.parseInt(op.split(" ")[1]) > 0) {
                            alocuente[j] = 0;
                        }
                    }
                }
            } else if (op.equals("defragment")) {
                int cnt = 0;
                cnt = alocuente.stream().filter(x -> x != 0).count();
                alocuente = Arrays.asList(alocuente).stream().filter(x -> x != 0).toArray(new int[cnt]);
                for (int j = 0; j < cnt; j++) {
                    alocuente.add(0);
                }
            }
        }
    }
}
