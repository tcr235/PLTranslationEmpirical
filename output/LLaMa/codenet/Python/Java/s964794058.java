import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the time: ");
        int memTime = scanner.nextInt();
        
        System.out.print("Enter the late data (space-separated): ");
        String[] memLateStr = scanner.nextLine().split(" ");
        int[] memLate = new int[memLateStr.length];
        for (int i = 0; i < memLateStr.length; i++) {
            memLate[i] = Integer.parseInt(memLateStr[i]);
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