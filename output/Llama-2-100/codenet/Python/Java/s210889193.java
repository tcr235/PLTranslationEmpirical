public class s210889193 {
    public static void solver() {
        int N = Integer.parseInt(sc.nextLine());
        List<List<Integer>> action = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                temp.add(Integer.parseInt(sc.nextLine().split(" ")[j]));
            }
            action.add(temp);
        }

        int[][] dp = new int[N][3];

        for (int i = 0; i < 3; i++) {
            dp[0][i] = action.get(0).get(i);
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = Math.max(dp[i - 1][j] + action.get(i).get(j), dp[i - 1][(j + 1) % 3] + action.get(i).get((j + 1) % 3));
            }
        }

        System.out.println(Math.max(dp[N - 1]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solver();
    }
}
