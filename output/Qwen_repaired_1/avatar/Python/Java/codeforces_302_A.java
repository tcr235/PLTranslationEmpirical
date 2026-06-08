import java.util.*;

public class codeforces_302_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, List<String>> maps = new HashMap<>();
        int[] num = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        List<String> strNums = sc.nextLine().chars()
            .filter(c -> c == '-')
            .boxed()
            .map(String::valueOf)
            .collect(Collectors.toList());

        int sa = Math.min(num[0] - strNums.size(), strNums.size());

        for(int i = 0; i < num[1]; i++){
            String s[] = sc.nextLine().split(" ");
            boolean isOdd =(Integer.parseInt(s[1]) - Integer.parseInt(s[0])) % 2 != 0 ? true : false;
            boolean isSmall = ( Integer.parseInt(s[1]) - Integer.parseInt(s[0])<= sa*2);

            if(isOdd && isSmall){
                maps.put(i,"1\n");
            }else{
                maps.put(i,"0\n");
            }
        }

        for(int val :maps.values()){
            System.out.print(val);
        }
    }
}