List<Integer> nums = Arrays.asList(input().split(" "));
nums.sort(Collections.reverseOrder());
System.out.println(nums.get(0)*10+nums.get(1)+nums.get(2));
