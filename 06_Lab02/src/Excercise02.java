
public class Excercise02 {
    public static void main(String[] args) {
        int regNo = 231011045; 
        
        // Dividing by 10,000,000 removes the last 7 digits
        int joinYear = regNo / 10000000;

        System.out.println("Registration Number: " + regNo);
        System.out.println("Year of Joining: 20" + joinYear);
    }
}