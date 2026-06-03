import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String[] S = new String[N];
        for(int i=0; i<N; i++) {
            S[i] = scanner.nextLine().trim();
        }
        
        List<Character> march = Arrays.asList('M', 'A', 'R', 'C', 'H');
        int[] marchLis = new int[5];
        
        for(int i=0; i<N; i++) {
            char firstChar = Character.toUpperCase(S[i].charAt(0));
            if(march.contains(firstChar)) {
                int index = march.indexOf(firstChar);
                marchLis[index]++;
            }
        }
        
        int ans = 0;
        
        for(int x=0; x<5; x++) {
            for(int y=x+1; y<5; y++) {
                for(int z=y+1; z<5; z++) {
                    ans += marchLis[x] * marchLis[y] * marchLis[z];
                }
            }
        }

        System.out.println(ans);
    }
}