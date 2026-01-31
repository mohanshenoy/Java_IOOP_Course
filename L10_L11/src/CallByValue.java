class Test1 {
    long  meth(long x) {
        x = x + 10;
        return x;
    }
}
public class CallByValue {
    public static void main(String args[]) {
        Test1 ob = new Test1();
        int a = 15;
        System.out.println("value of a before call: " + a);
        a = (int) ob.meth(a);
        System.out.println("value of a after call " + a);
    }
}