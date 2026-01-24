
public class Slide35_2 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) { // number of rows
            for (int j = 5; j >= 1; j--) { // number of stars
                if(j > i) {
                	System.out.print(" ");
                }else {
                	System.out.print("*");
                }
            }
            System.out.println(); // print next line 
        }
    }
}