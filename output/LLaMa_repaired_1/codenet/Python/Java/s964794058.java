import java.util.ArrayList;
import java.util.Scanner;

public class s964794058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int memTime = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        
        String[] memLateStr = scanner.nextLine().split(" ");
        int[] memLate = new int[memLateStr.length];
        for (int i = 0; i < memLateStr.length; i++) {
            if (!memLateStr[i].isEmpty()) {
                memLate[i] = Integer.parseInt(memLateStr[i]);
            } else {
                memLate[i] = 0;
            }
        }
        
        ArrayList<Integer> colorList = new ArrayList<>();
        int memColor = 0;
        int highLate = 0;
        
        for (int color = 0; color < memTime; color++) {
            int member = memLate[color];
            if (member / 400 >= 8) {
                highLate++;
            }
            else if (!colorList.contains(member / 400)) {
                colorList.add(member / 400);
            }
        }
        
        int maxColor = colorList.size() + highLate;
        int minColor = colorList.size();
        if (minColor == 0) {
            minColor = 1;
        }
        
        System.out.println(minColor + " " + maxColor);
    }
}