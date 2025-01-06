public class Q4 {
    public static void main(String[] args) {
        int[] elements = { 10, 20, 30, 40, 50, 100, 70, 88 };
        int length = elements.length;
        int ans1 = elements[(elements.length / 2) - 1];
        int nas2 = elements[(elements.length / 2)];
        System.out.println(elements[(elements.length / 2) - 1] + ",");
        System.out.println(elements[(elements.length / 2)] + ",");
    }
}