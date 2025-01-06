import java.util.Arrays;

class Q2 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40 };
        System.out.println("initial:" + Arrays.toString(elements));
        elements[elements.length - 1] = 200;
        System.out.println("final:" + Arrays.toString(elements));

    }
}