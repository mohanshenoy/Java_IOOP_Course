package MyPack;

class AccountBalance1 {
    public static void main(String args[]) {
        Balance1 current[] = new Balance1[3];
        current[0] = new Balance1("K. J. Fielding", 123.23);
        current[1] = new Balance1("Will Tell", 157.02);
        current[2] = new Balance1("Tom Jackson", -12.33);
        
        current[1].show();
    }
}