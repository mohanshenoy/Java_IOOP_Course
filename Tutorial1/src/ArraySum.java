public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;

        // Iterate and accumulate
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("The total sum is: " + sum);
    }
}