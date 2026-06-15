# B - AtCoder Beginner Contest 111

import java.util.Arrays;

N = sc.nextInt();
arr = new int[] {111, 222, 333, 444, 555, 666, 777, 888, 999};
int ans_idx = Arrays.asList(arr).binarySearch(N);
System.out.println(arr[ans_idx]);
