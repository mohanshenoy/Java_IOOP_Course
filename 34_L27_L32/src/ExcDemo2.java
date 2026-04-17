class ExcDemo2 {
    public static void main(String args[]) {
        
        try {
            ExcTest.genException(); 
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            System.out.println("Index out-of-bounds!");
        }
        finally {
        	System.out.println("After catch statement.");
		}
    }
}