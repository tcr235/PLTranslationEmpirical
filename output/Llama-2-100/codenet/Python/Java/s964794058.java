public class s964794058 {
    public static void main(String[] args) {
        int memTime = Integer.parseInt(sc.nextLine());
        String[] memLate = sc.nextLine().split(" ");
        List<Integer> colorList = new ArrayList<>();
        int memColor = 0;
        int highLate = 0;
        for (int i = 0; i < memTime; i++) {
            int member = Integer.parseInt(memLate[i]);
            if (member >= 400 && member % 400 >= 8) {
                highLate++;
            } else if (!colorList.contains(member / 400)) {
                colorList.add(member / 400);
            }
        }
        int maxColor = colorList.size() + highLate;
        int minColor = colorList.size();
        if (minColor == 0) {
            minColor = 1;
        }
        System.out.println(minColor + " " + maxColor);
    }
}
