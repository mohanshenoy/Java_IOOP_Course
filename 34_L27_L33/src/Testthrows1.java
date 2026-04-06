import java.io.IOException;

class Testthrows1 {
    void m() throws IOException {
        int a = 10;//update to 5
        if (a == 5)
            throw new IOException();
        else 
            System.out.println("not thrown");
    }
    void p() {
        try {
            m();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        Testthrows1 obj = new Testthrows1();
        obj.p();
        System.out.println("normal flow...");
    }
}