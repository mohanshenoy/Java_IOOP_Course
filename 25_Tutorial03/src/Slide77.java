public class Slide77 {
    public static void main(String[] args) {
    	String str = "success";
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            if (array[i] == '0') continue; 
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    array[j] = '0'; 
                }
            }
            System.out.println(array[i] + " : " + count);
        }
    }
}