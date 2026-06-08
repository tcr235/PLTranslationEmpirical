import java.util.*;
import java.math.BigInteger;

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
            boolean found = false;
            for (int j = 0; j <= 30 && !found; j++) {
                i = i / 2;
                found = i % 2 != 0;
                if (found) {
                    twoTimesSet.add(j);
                }
            }
            if (twoTimesSet.size() != 1) {
                System.out.println(0);
                return;
            }
        }
        int lcm = findLcm(numSet);
        System.out.println((num - lcm / 2) / lcm + 1);

    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int findLcm(Collection<Integer> numbers) {
        BigInteger lcm = numbers.iterator().next().BigIntegerValue();
        for (int number : numbers) {
            lcm = (lcm * BigInteger.valueOf(number)).divide(gcd(lcm.intValue(), number));
        }
        return lcm.intValue();
    }
}

class IntegerWithBigIntegerValue implements Comparable<IntegerWithBigIntegerValue>{
    private Integer value;
    private BigInteger bigValue;

    public IntegerWithBigIntegerValue(Integer value) {
        this.value = value;
        this.bigValue = BigInteger.valueOf(value);
    }

    @Override
    public int compareTo(IntegerWithBigIntegerValue o) {
        return getBigInt().compareTo(o.getBigInt());
    }

    public BigInteger getBigInt() {
        return bigValue;
    }

    public int intValue() {
        return value;
    }
}