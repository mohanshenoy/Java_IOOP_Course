public class Excercise06 {
	
    public static void main(String[] args) {
        double[] dailyUnits = {8, 8, 8, 8, 8, 8, 8};  // 7 days consumption
        double totalUnits = 0;
        double totalBill = 0;

        // sum of units consumed
        for (int i = 0; i < dailyUnits.length; i++) {
            totalUnits += dailyUnits[i];
        }

        // Using (int) division to categorize units for switch-case
        // 0-100 units -> category 0 or 1 (if exactly 100)
        // 101-200 units -> category 1 or 2
        int category = (totalUnits <= 100) ? 1 : (totalUnits <= 200) ? 2 : 3;

        switch (category) {
            case 1:
                totalBill = totalUnits * 7.00;
                break;
            case 2:
                totalBill = (100 * 7.00) + ((totalUnits - 100) * 8.00);
                break;
            case 3:
                totalBill = (100 * 7.00) + (100 * 8.00) + ((totalUnits - 200) * 10.00);
                break;
            default:
                System.out.println("Invalid consumption calculated.");
        }
        System.out.println("Total Units Consumed in 7 Days: " + totalUnits);
        System.out.println("Total Electricity Bill: INR " + totalBill);
    }
}