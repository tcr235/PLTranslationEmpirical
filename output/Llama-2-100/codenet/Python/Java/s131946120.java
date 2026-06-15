import java.util.Scanner;

public class s131946120 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Collections.frequency(new HashSet<>(Arrays.asList(scanner.nextLine().split(" "))), " "));
    }
}
