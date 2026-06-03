import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int num_inp() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] arr_inp() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        return array;
    }

    public static int[] sp_inp() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        return array;
    }

    public static int[] sorted_arr() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("0"));
        String line = reader.readLine();
        String[] input = line.split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) throws IOException {
        int[] a = sorted_arr();
        System.out.println(Arrays.stream(a).anyMatch(x -> x % a[0] == 0) ? a[0] : -1);
    }
}