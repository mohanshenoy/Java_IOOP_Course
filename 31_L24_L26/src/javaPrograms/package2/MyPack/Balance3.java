package javaPrograms.package2.MyPack;

public class Balance3 {
    String name;
    double bal;

    public Balance3(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        System.out.println(name + ": $" + bal);
    }
}