public class Q46 {
    public static void main(String[] args) {
        int[] elements = { 12, 43, 32, 89, 56, 29 };
        int sum = 0;
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (i % 2 == 0) {
                sum += elements[i];
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println(avg);

    }

}
