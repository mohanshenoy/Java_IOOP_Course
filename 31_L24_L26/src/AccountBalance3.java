
import javaPrograms.package2.MyPack.Balance3;

class AccountBalance3 {
    public static void main(String args[]) {
        Balance3 current[] = new Balance3[3];
        current[0] = new Balance3("K. J. Fielding", 123.23);
        current[1] = new Balance3("Will Tell", 157.02);
        current[2] = new Balance3("Tom Jackson", -12.33);

        for (int i = 0; i < 3; i++) {
            current[i].show();
        }
    }
}