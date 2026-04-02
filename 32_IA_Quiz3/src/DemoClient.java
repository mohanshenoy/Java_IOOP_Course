abstract class Processor {
    int speed = 2;
    abstract void compute();
    void showSpeed() {
        System.out.print("Base:" + speed + " ");
    }
}
class FastProcessor extends Processor {
    int speed = 5;
    void compute() {
        System.out.print("FastCompute ");
    }
    void showSpeed() {
        System.out.print("Fast:" + speed + " ");
    }
}
public class DemoClient {
    public static void main(String[] args) {
        Processor p = new FastProcessor();
        p.compute();
        p.showSpeed();
    }
}
//A) FastCompute Fast:5
//B) FastCompute Base:2
//C) FastCompute Fast:5 ***
//D) FastCompute Base:2