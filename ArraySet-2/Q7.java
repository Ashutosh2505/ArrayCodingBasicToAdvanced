import java.util.Arrays;

class Q7 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40, 500 };
        System.out.println("initial:" + Arrays.toString(elements));
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        int avg = sum / elements.length;
        elements[elements.length / 2] = avg;
        System.out.println("final:" + Arrays.toString(elements));

    }
}