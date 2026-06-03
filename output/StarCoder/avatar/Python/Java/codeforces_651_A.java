import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] parts = scanner.nextLine().split(" ");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        
        System.out.println(Math.max(x + y - 3 + ((y - x) % 3 > 0), 0));
        
        int numInp() {
            return Integer.parseInt(scanner.nextLine());
        }
        
        int[] arrInp() {
            String[] elements = scanner.nextLine().split(" ");
            int[] array = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                array[i] = Integer.parseInt(elements[i]);
            }
            return array;
        }
        
        void spInp() {
            parts = scanner.nextLine().split(" ");
        }
        
        String strInp() {
            return scanner.nextLine();
        }
        
        scanner.close();
    }
}