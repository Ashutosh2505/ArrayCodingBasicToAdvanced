class Q37 {
    public static void main(String[] args) {
        int elements[] = { 23, 90, 30, 20, 40, 54, 76 };

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] > max1) {
                max2 = max1;
                max1 = elements[i];
            } else if (elements[i] > max2 && elements[i] < max1) {
                max2 = elements[i];
            }
        }
        System.out.println(max2);
    }
}