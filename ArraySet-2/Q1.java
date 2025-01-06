import java.util.Arrays;

class Q1 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40 };
        System.out.println("initial:" + Arrays.toString(elements));
        elements[0] = 100;
        System.out.println("final:" + Arrays.toString(elements));

    }
}