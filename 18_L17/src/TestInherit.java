class OneDimPoint {
    int x = 3;
    int getX() { 
    	return x; 
    }
}
class TwoDimPoint extends OneDimPoint {
    int y = 4;
    int getY() { 
    	return y; 
    }
}
public class TestInherit {
    public static void main(String[] args) {
        TwoDimPoint pt = new TwoDimPoint();
        System.out.println(pt.getX() + "," + pt.getY());
    }
}