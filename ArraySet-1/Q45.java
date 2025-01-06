public class Q45 {
    public static void main(String[] args) {
        int[] elements = { 12, 34, 65, 43, 98, 19 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < elements.length; i++) {
            if (i % 2 != 0 && elements[i] > max) {

                max = elements[i];
            }
        }
        System.out.println(max);
    }

}
