package MyPack;
public class Balance2 {
    String name;
    double bal;

    public Balance2(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        System.out.println(name + " " + bal);
    }
}