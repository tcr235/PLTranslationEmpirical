```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int[] allocuente = new int[m];
        int ind = 1;

        for (int i = 0; i < t; i++) {
            String[] op = scanner.nextLine().split(" ");

            if (op[0].equals("alloc")) {
                int pos = 0;
                boolean found = false;
                for (int j = 0; j < m; j++) {
                    if (allocuente[j] == 0) {
                        pos++;
                        if (pos == Integer.parseInt(op[1])) {
                            for (int k = j - Integer.parseInt(op[1]) + 1; k <= j; k++) {
                                allocuente[k] = ind;
                            }
                            System.out.println(ind);
                            ind++;
                            found = true;
                            break;
                        }
                    } else {
                        pos = 0;
                    }
                }
                if (!found) {
                    System.out.println("NULL");
                }
            }

            if (op[0].equals("erase")) {
                int pos = 0;
                if (!isInArray(Integer.parseInt(op[1]), allocuente) || Integer.parseInt(op[1]) == 0) {
                    System.out.println("ILLEGAL_ERASE_ARGUMENT");
                } else {
                    for (int j = 0; j < m; j++) {
                        if (Integer.parseInt(op[1]) > 0 && allocuente[j] == Integer.parseInt(op[1])) {
                            allocuente[j] = 0;
                        }
                    }
                }
            }

            if (op[0].equals("defragment")) {
                int cnt = countZeroes(allocuente);
                int[] temp = new int[allocuente.length + cnt];
                int index = 0;
                for (int j = 0; j < allocuente.length; j++) {
                    if (allocuente[j] != 0) {
                        temp[index] = allocuente[j];
                        index++;
                    }
                }
                System.arraycopy(temp, 0, allocuente, 0, temp.length);
            }
        }
    }

    public static boolean isInArray(int target, int[] array) {
        for (int i = 0; i <