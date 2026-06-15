public class atcoder_ABC169_E {
    public static void resolve() {
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> low = new ArrayList<>();
        List<Integer> high = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            low.add(Integer.parseInt(input[0]));
            high.add(Integer.parseInt(input[1]));
        }
        Collections.sort(low);
        Collections.sort(high);
        if (n % 2 == 1) {
            int hh = (high[n / 2 - 1] + high[n / 2]) / 2;
            int ll = (low[n / 2 - 1] + low[n / 2]) / 2;
            System.out.println(hh - ll + 1);
        } else {
            int hh = (high[n / 2 - 1] + high[n / 2]) / 2;
            int ll = (low[n / 2 - 1] + low[n / 2]) / 2;
            System.out.println(hh - ll);
        }
    }

    public static void main(String[] args) {
        resolve();
    }
}
