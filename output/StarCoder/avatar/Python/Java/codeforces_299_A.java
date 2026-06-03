import java.util.*;
import java.io.*;

public class codeforces_299_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] aStr = br.readLine().split(" ");
        Arrays.sort(aStr);
        int[] a = new int[aStr.length];
        for (int i = 0; i < aStr.length; i++) a[i] = Integer.parseInt(aStr[i]);
        
        boolean divisible = false;
        for (int x : a) if (x % a[0] != 0) { divisible = true; break; }
        
        System.out.println(divisible ? a[0] + " -1" : a[0]);
    }
}