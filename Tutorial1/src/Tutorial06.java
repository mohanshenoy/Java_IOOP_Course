
public class Tutorial06 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = arr1;
        arr2[6] = 6;
        System.out.println(arr2[6]);
    }
}