import MyPack.*;

class AccountBalance2 { // In the parent folder of mypack
    public static void main(String args[]) {
        Balance2 current[] = new Balance2[3];
        current[0] = new Balance2("K. J. Fielding", 123.23);
        current[1] = new Balance2("Will Tell", 157.02);
        current[2] = new Balance2("Tom Jackson", -12.33);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}