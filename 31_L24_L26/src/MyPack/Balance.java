package MyPack;

class Balance {
    String name;
    double bal;

    Balance(String n, double b) {
        name = n;
        bal = b;
    }

    void show() {
        System.out.println(name + " " + bal);
    }
}

class AccountBalance {
    public static void main(String args[]) {
        Balance current = new Balance("Herbert Schildt", 1243.78);
        current.show();
    }
}