import java.util.Arrays;
import java.util.stream.Collectors;

public class s052231578 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> arr = Arrays.asList(111, 222, 333, 444, 555, 666, 777, 888, 999);

        int ans_idx = Collections.binarySearch(arr, N);

        System.out.println(arr.get(ans_idx));

    }

}
