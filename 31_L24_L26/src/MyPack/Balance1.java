package MyPack;
public class Balance1 {
    String name;
    double bal;

    public Balance1(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        System.out.println(name + " " + bal);
    }
}