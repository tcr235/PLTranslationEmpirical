public class s804484425 {
    public int solution(int n, int k) {
        int[][] info = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] input = readLine().split(" ");
            info[i][0] = Integer.parseInt(input[0]);
            info[i][1] = Integer.parseInt(input[1]);
        }
        
        // Sort the input based on the second element
        Arrays.sort(info, Comparator.comparingInt(o -> o[1]));
        
        // Get the first k elements
        int[] selected = new int[k];
        for (int i = 0; i < k; i++) {
            selected[i] = info[i][1];
        }
        
        // Get the remaining elements
        int[] unselected = new int[n - k];
        for (int i = k; i < n; i++) {
            unselected[i - k] = info[i][1];
        }
        
        // Calculate the sum of the selected elements
        int sumSelect = 0;
        for (int d : selected) {
            sumSelect += d;
        }
        
        // Calculate the number of types of unselected elements
        int cntType = 0;
        for (int d : unselected) {
            cntType++;
        }
        
        // Calculate the answer
        int ans = cntType * cntType + sumSelect;
        
        // Print the answer
        System.out.println(ans);
        
        return ans;
    }
}
