import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, num;
        n = scanner.nextInt();
        num = scanner.nextInt();
        List<Integer> numSet = new ArrayList<>();
        List<Integer> twoTimesSet = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            for (int j = 0; j < inputArray.length; j++) {
                int temp = Integer.parseInt(inputArray[j]);
                if (temp % 2 == 0) {
                    twoTimesSet.add(temp);
                } else {
                    numSet.add(temp);
                }
            }
        }
        if (twoTimesSet.size() != 1) {
            System.out.println(0);
        } else {
            List<Integer> lcmList = new ArrayList<>();
            for (int i = 0; i < numSet.size(); i++) {
                int num = numSet.get(i);
                int lcm = 1;
                for (int j = 1; j <= num; j++) {
                    lcm = lcm * (j * num) / gcd(lcm, j * num);
                }
                lcmList.add(lcm);
            }
            int result = (num - lcmList.get(0) / 2) / lcmList.get(0) + 1;
            System.out.println(result);
        }
    }


