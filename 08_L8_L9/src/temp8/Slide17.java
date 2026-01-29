package temp8;

public class Slide17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class CopyConstructor {
    String name;
    int age;

    // Parameterized Constructor
    CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    CopyConstructor(CopyConstructor obj) {
        this.name = obj.name;
        this.age = obj.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor("David", 35);
        CopyConstructor obj2 = new CopyConstructor(obj1);
        obj1.display();
        obj2.display();
    }
}