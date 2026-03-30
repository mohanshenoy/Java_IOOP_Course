import java.util.Objects;

public class SnowBoard {

	private String brand = "Burton";
	private double length=7.5;
	private int flexRating=1; //1=soft,10=stiff
	private boolean isDirectional=true; // true if designed to ride in one direction
	
	void turn() {System.out.println("inside turn method....");}
	void shred() {System.out.println("inside shred method....");}
	void getAir() {System.out.println("inside getAir method....");}
	void loseControl() {System.out.println("inside loseControl method....");}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    SnowBoard other = (SnowBoard) obj;
	    return Double.compare(other.length, length) == 0 &&
	           flexRating == other.flexRating &&
	           isDirectional == other.isDirectional &&
	           Objects.equals(brand, other.brand);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, length, flexRating, isDirectional);
	}
	
	@Override
	public String toString() {
	    return "SnowBoard { " +
	           "brand='" + brand + '\'' +
	           ", length=" + length + "cm" +
	           ", flex=" + flexRating +
	           ", directional=" + isDirectional +
	           " }";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String[] args) {
//		SnowBoard sb = new SnowBoard();
//		sb.turn();
//		Object o = sb;
//		System.out.println(o.equals(o));
//		System.out.println(o.getClass());
//		System.out.println(o.hashCode());
//		System.out.println(o.toString());
		
		SnowBoard sb1 = new SnowBoard();
		SnowBoard sb2 = new SnowBoard();
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.getClass());
		System.out.println(sb1.hashCode());
		System.out.println(sb1.toString());
		
	}

	
}
