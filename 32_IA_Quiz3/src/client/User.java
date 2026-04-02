package client;
import core.Entity;
public class User extends Entity {
    int id = 20; 
    public User() {
        super.id = 30; 
    }
    public String toString() {
        return super.toString() + "-User:" + id;
    }
    public static void main(String[] args) {
        Entity e = new User();
        System.out.print(e);
    }
}
//A) ID:30-User:20***
//B) ID:10-User:20
//C) ID:20-User:20
//D) Compilation error
