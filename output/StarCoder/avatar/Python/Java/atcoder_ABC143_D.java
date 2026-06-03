import java.util.*;

public class atcoder_ABC143_D {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        Collections.sort(al);
        long sum = 0;
        for (int i = 0; i < al.size(); ++i) {
            int maxDiff = Math.max(0, al.get(i) * 2 - al.get(0));
            int minSum = al.get(i) * 2 - maxDiff <= al.get(al.size() - 1) ? al.get(i) * 2 - maxDiff : al.get(0);
            int first = lowerBound(al, minSum);
            int second = upperBound(al, maxDiff);
            for (int j = first; j < second; ++j) {
                if (first <= i || second <= j) {
                    --sum;
                } else {
                    --second;
                }
            }
            sum += (long)(second - first);
        }
        System.out.println(sum / 3);
    }

    private static int lowerBound(ArrayList<Integer> list, int val) {
        int l = -1, r = list.size();
        while (l + 1 < r) {
            int m = (l + r) >> 1;
            if (list.get(m) >= val) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

    private static int upperBound(ArrayList<Integer> list, int val) {
        int l = -1, r = list.size();
        while (l + 1 < r) {
            int m = (l + r) >> 1;
            if (list.get(m) > val) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }
}