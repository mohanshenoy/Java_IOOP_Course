
public class Slide60 {
    public static void main(String[] args) {
    	StringBuffer s3 = new StringBuffer("1");
        System.out.println(s3.capacity());
        System.out.println(s3.length());
        System.out.println();
        
        s3.append("1234567890");
        System.out.println(s3.capacity());
        System.out.println(s3.length());
        System.out.println();
        
        System.out.println("When length were to exceed capacity,"
        		+ "Java would automatically expand the capacity using "
        		+ "the formula [(oldCapacity*2)+2]");
        
        s3.append("1234567890");
        System.out.println(s3.capacity());
        System.out.println(s3.length());
        System.out.println();

        s3.append("1234567890");
        System.out.println(s3.capacity());
        System.out.println(s3.length());
        System.out.println();  
        
        System.out.println("When length were to exceed capacity,"
        		+ "Java would automatically expand the capacity using "
        		+ "the formula [(oldCapacity*2)+2]");
        
        s3.append("1234567890");
        System.out.println(s3.capacity());
        System.out.println(s3.length());
        System.out.println();

    }
}
