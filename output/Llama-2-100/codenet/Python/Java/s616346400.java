public static String atc_079a(String inputValue) {
    int n = 3;
    for (int i = 0; i < inputValue.length() + 1 - n; i++) {
        for (int j = 1; j < n; j++) {
            if (inputValue.charAt(i) != inputValue.charAt(i + j)) {
                break;
            }
            if (j == n - 1) {
                return "Yes";
            }
        }
    }
    return "No";
}
