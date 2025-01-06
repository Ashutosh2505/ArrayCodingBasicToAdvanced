public class Q44 {
    public static void main(String[] args) {
        int[] elements = { 12, 65, 34, 87, 9, 12, 19 };
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < elements.length; i++) {
            if (i % 2 == 0 && elements[i] < min) {
                min = elements[i];
            }

        }
        System.out.println(min);
    }

}
