import java.util.*;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int num = Integer.parseInt(input[1]);
        Set<Integer> numSet = new HashSet<>();
        Set<Integer> twoTimesSet = new HashSet<>();
        String[] numbers = scanner.nextLine().split(" ");
        for (String number : numbers) {
            numSet.add(Integer.parseInt(number));
        }
        for (int i : numSet) {
            for (int j = 1; j <= 30; j++) {
                i /= 2;
                if (i % 2 != 0) {
                    twoTimesSet.add(j);
                    break;
                }
            }
            if (twoTimesSet.size() != 1) {
                System.out.println(0);
                return;
            }
        }
        List<Integer> numList = new ArrayList<>(numSet);
        int lcm = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            lcm = (lcm * numList.get(i)) / gcd(lcm, numList.get(i));
        }
        System.out.println((num - lcm / 2) / lcm + 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}