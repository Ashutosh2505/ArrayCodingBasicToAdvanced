public class Q43 {
    public static void main(String[] args) {
        int[] elements = { 12, 43, 8, 56, 34 };
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            if (i % 2 != 0) {
                sum += elements[i];
            }
        }
        System.out.println(sum);
    }

}
