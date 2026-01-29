public class Excercise03 {
    public static void main(String[] args) {
        int birthDay = 15;
        int birthMonth = 8;
        int birthYear = 1990;
        
        int serviceYears = 60;
        
        int retirementYear = birthYear + serviceYears;

        System.out.println("Date of Birth: " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Service Period: " + serviceYears + " years");
        System.out.println("Date of Retirement: " + birthDay + "/" + birthMonth + "/" + retirementYear);
    }
}