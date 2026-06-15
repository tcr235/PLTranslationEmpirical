public class atcoder_AGC043_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(input());
        List<Integer> nums = Arrays.asList(input().split(" ").stream().map(Integer::parseInt).collect(Collectors.toList()));
        boolean noOne = false;
        if (!nums.contains(1)) {
            nums = Arrays.asList(nums.stream().map(num -> num / 2).collect(Collectors.toList()));
            noOne = true;
        }
        boolean isOdd = false;
        for (int i = 0; i < nums.size(); i++) {
            if (!isParityOfNCR(n - 1, i) && nums.get(i) & 1) {
                isOdd ^= 1;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println(1 << noOne);
        }
    }

    public static boolean isParityOfNCR(int n, int i) {
        return (n - 1) % 2 == i % 2;
    }
}


