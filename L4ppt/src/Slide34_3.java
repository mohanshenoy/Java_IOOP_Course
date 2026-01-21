public class Slide34_3 {
    public static void main(String[] args) {
        int number = -123;
        int count = 0;
        if(number < 0) { // number is -ve
        	number = -number;
        }if (number == 0) { // number =0
            count = 1;
        }else {
        	int temp = number;
            while (temp > 0) {
                temp = temp / 10;
                count++;
            }
        }
        System.out.println("Number of digits in " + number + " is: " + count);
    }
}