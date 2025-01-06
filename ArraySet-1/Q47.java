public class Q47 {
    public static void main(String[] args) {
        int[] elements = { 12, 23, 45, 56, 78, 89 };
        int sum = 0;
        int count = 0;
        for (int i = 0; i < elements.length; i++) {
            if (i % 2 != 0) {
                sum += elements[i];
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println(avg);
    }

}
