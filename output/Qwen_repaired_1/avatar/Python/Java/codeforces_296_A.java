import java.util.Arrays; 
import java.util.Scanner;

public class codeforces_296_A {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] m = sc.nextLine().trim().split("\\s+");

        Arrays.sort(m);

        boolean possible = true;

        for(int i=0;i<n/2+1;i++){
            if(!m[i].equals(m[n/2+i])){
                possible=false;
                break;
        }
    }

        System.out.println((possible)? "YES" : "NO");
    
    }
}