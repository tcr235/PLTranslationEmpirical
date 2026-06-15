import java.util.*;
public class codeforces_25_A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] list = new int[n];
        for(int i=0;i<n;i++){
            list[i] = in.nextInt() % 2;
        }
        if(Arrays.stream(list).sum() == 1){
            System.out.println(Arrays.stream(list).filter(x -> x == 1).findFirst().getAsInt() + 1);
        }else{
            System.out.println(Arrays.stream(list).filter(x -> x == 0).findFirst().getAsInt() + 1);
        }
    }
}

