public class Q27 {
    public static void main(String[] args) {
        int[] elements = { 10, 21, 30, 40, 50, 90, 100, 70, 88 };
        // 0 1 2 3 4 5 6
        // length = 9

        for (int i = elements.length - 1; i >= 0; i -= 2) {
            System.out.println(elements[i] + "  ");
        }
        System.out.println();
        System.out.println("done");
    }
}