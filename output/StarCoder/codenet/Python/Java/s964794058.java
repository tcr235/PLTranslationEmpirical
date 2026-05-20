import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memTime = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        String[] memLateInput = scanner.nextLine().split(" ");
        int[] memLate = new int[memTime];
        for (int i = 0; i < memTime; i++) {
            memLate[i] = Integer.parseInt(memLateInput[i]);
        }

        HashSet<Integer> colorList = new HashSet<>();
        int highLate = 0;

        for (int color : memLate) {
            if (color / 400 >= 8) {
                highLate++;
            } else {
                if (!colorList.contains(color / 400)) {
                    colorList.add(color / 400);
                }
            }
        }

        int maxColor = colorList.size() + highLate;
        int minColor = colorList.size();

        if (minColor == 0) {
            minColor = 1;
        }

        System.out.println(minColor + " " + maxColor);
        scanner.close();
    }
}