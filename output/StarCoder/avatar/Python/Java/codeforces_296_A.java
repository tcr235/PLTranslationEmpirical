import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] m = scanner.nextLine().split(" ");
        boolean possible = true;
        
        Set<String> uniqueElements = new HashSet<>();
        for (String element : m) {
            uniqueElements.add(element);
        }
        
        for (String i : uniqueElements) {
            if (countOccurrences(m, i) >= n / 2 + 1) {
                possible = false;
                break;
            }
        }
        
        System.out.println(possible ? "YES" : "NO");
    }

    private static int countOccurrences(String[] array, String element) {
        int count = 0;
        for (String item : array) {
            if (item.equals(element)) {
                count++;
            }
        }
        return count;
    }
}