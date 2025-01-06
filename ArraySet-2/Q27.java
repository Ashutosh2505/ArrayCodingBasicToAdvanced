import java.util.Arrays;

class Q27 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40, 500 };
        System.out.println("initial:" + Arrays.toString(elements));
        int temp1 = elements[elements.length - 3];
        int temp2 = elements[elements.length - 2];
        int temp3 = elements[elements.length - 1];

        for (int i = elements.length - 1; i > 2; i--) {
            elements[i] = elements[i - 2];
        }
        elements[0] = temp1;
        elements[1] = temp2;
        elements[2] = temp3;
        System.out.println("final:" + Arrays.toString(elements));

    }
}