import java.util.Arrays;

class Q15 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 120, 578, 5, 35, 40, 500 };
        System.out.println("initial:" + Arrays.toString(elements));
        for (int i = elements.length / 2; i < elements.length; i++) {
            elements[i] = elements[i] + elements[elements.length - 1 - (i - elements.length / 2)];
            elements[elements.length - 1 - (i - elements.length / 2)] = elements[i]
                    - elements[elements.length - 1 - (i - elements.length / 2)];
            elements[i] = elements[i] - elements[elements.length - 1 - (i - elements.length / 2)];

        }

        System.out.println("final:" + Arrays.toString(elements));

    }
}