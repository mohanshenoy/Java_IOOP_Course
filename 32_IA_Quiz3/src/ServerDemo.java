
class Server {
    final String status = "Active";
      public String toString() {
        return "ServerState[" + status + "]";
    }
}
class DatabaseServer extends Server {
    DatabaseServer() {
        status = "Offline"; 
    }
    public String toString() {
        return "DB_" + super.toString();
    }
}
public class ServerDemo {
    public static void main(String[] args) {
        Server s1 = new DatabaseServer();
        System.out.print(s1);
    }
}
//A) DB_ServerState[Offline]
//B) DB_ServerState[Active]
//C) Compilation error ***
//D) ServerState[Active]
		