public class Q49 {
    public static void main(String[] args) {
        int[] elements = { 23, 45, 98, 45, 67, 21 };
        int sum = 0;
        for (int i = elements.length / 2; i < elements.length; i++) {
            sum += elements[i];
        }
        System.out.println(sum);
    }

}
