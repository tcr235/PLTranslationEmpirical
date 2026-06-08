import java.util.*;

public class atcoder_ABC150_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int num = Integer.parseInt(input[1]);
        Set<Integer> numSet = Arrays.stream(scanner.nextLine().split(" "))
                                     .map(Integer::parseInt)
                                     .collect(Collectors.toList())
                                     .stream()
                                     .collect(Collectors.toSet());
        Set<Integer> twoTimesSet = new HashSet<>();

        for (int i : numSet) {
            for (int j = 1; j < 30; j++) {
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
            lcm *= numList.get(i);
            lcm /= gcd(lcm, numList.get(i));
        }

        System.out.print((num - lcm / 2) / (lcm) + 1);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}