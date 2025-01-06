public class Q48 {
    public static void main(String[] args) {
        int[] elements = { 12, 56, 34, 98, 76, 92 };
        int sum = 0;
        for (int i = 0; i < elements.length / 2; i++) {
            sum += elements[i];
        }
        System.out.println(sum);
    }

}
