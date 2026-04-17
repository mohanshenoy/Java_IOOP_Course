public class ElectionDemo {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Invalid age to vote for Parliamentary Elections");
        }
    }
    public static void main(String[] args) {
    		System.out.println("Voting is began...");
		try {
			checkAge(16);
			System.out.println("Citizen can Vote");
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 
    		try {
            checkAge(19);
            System.out.println("Citizen can Vote");
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
			System.out.println("Voting is completed");
		}
    }
}