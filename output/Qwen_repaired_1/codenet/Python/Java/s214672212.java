import java.io.*;
import java.util.*;

class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = reader.readLine().split("\\s+");
        Integer[] numArray = Arrays.stream(inputs).map(Integer::parseInt).toArray(Integer[]::new);
        Arrays.sort(numArray, Collections.reverseOrder());
        int result = numArray[0] * 100 + numArray[1] * 10 + numArray[2];
        System.out.println(result);
    }
}