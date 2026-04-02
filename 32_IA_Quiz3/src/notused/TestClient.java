package notused;

class Unit {
	int iTemp = 10;
	Unit(){
		System.out.print("Inside Unit Constructor");
	}
    Unit(int i) {
        System.out.print("iTemp=" + iTemp+", ");
        System.out.print("i=" + i+", ");
    }
}
class Section extends Unit{
	protected int prTemp = 20;
	Section(){
		System.out.print("Inside Section Constructor");
	}
	Section(int i, int j) {
        super(i);
        System.out.print("prTemp=" + prTemp+", ");
        System.out.print("j=" + j+", ");
    }
}
class Department extends Section {
	public int puTemp = 30;
	Department(int i, int j, int k) {
        super(i,j);
        System.out.print("puTemp=" + puTemp+", ");
        System.out.print("k=" + k+", ");
    }
	Department() {
        this(1,2,3);
        System.out.print("Department");
    }
}
public class TestClient {
    public static void main(String[] args) {
    	Department obj = new Department();
    }
}
//A) iTemp=10, i=1, prTemp=20, j=2, puTemp=30, k=3, Department***
//B) Department, puTemp=30, k=3, prTemp=20, j=2, iTemp=10, i=1
//C) Inside Unit Constructor Inside Section Constructor puTemp=30, k=3, Department
//D) iTemp=10, i=1, prTemp=20, j=2, Department

