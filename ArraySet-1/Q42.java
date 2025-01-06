public class Q42 {

    public static void main(String[] args) {
        int elements[] = { 4, 9, 6, 2, 6, 5 };
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            if (i % 2 == 0) {
                sum += elements[i];
            }
        }
        System.out.println(sum);
    }

}
