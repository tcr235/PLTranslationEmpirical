List<String> s = Arrays.asList(input().trim().split(""));
Collections.sort(s);
if (s.get(0).equals(s.get(1)) && s.get(0) != s.get(2) && s.get(2) == s.get(3)) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}

