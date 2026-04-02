interface DataOperation {
    void read();
    void write();
}
abstract class BaseData implements DataOperation {
    public void read() {
        System.out.print("BaseRead ");
    }
}
class SecureData extends BaseData {
    public void write() {
        System.out.print("SecureWrite ");
    }
    public void read() {
        super.read();
        System.out.print("SecureRead ");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        DataOperation doc = new SecureData();
        doc.read();
        doc.write();
    }
}
//A) BaseRead SecureWrite
//B) SecureRead SecureWrite
//C) BaseRead SecureRead SecureWrite ***
//D) SecureRead BaseRead SecureWrite