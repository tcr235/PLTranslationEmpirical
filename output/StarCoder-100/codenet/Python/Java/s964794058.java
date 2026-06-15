import java.util.*;
public class s964794058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int memTime = sc.nextInt();
        int[] memLate = new int[memTime];
        for (int i = 0; i < memTime; i++) {
            memLate[i] = sc.nextInt();
        }
        int highLate = 0;
        int[] colorList = new int[memTime];
        for (int i = 0; i < memTime; i++) {
            int member = memLate[i];
            if (member / 400 >= 8) {
                highLate++;
            } else if (Arrays.binarySearch(colorList, member / 400) == -1) {
                colorList[i] = member / 400;
            }
        }
        int maxColor = colorList.length + highLate;
        int minColor = colorList.length;
        if (minColor == 0) {
            minColor = 1;
        }
        System.out.println(minColor + " " + maxColor);
    }
}
