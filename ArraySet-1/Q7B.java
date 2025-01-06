public class Q7B {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 40, 50, 100, 70, 88 };
        // 0 1 2 3 4 5 6
        // length = 9
        for (int i = elements.length / 2; i < (elements.length) + 1; i++) {
            System.out.println(elements[i]);
        }
        System.out.println();
        System.out.println("done");
    }
}