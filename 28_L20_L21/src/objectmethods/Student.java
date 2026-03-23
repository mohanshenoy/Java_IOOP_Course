package objectmethods;
class Student implements Cloneable {
	int id;
    String name;
    Student(String name) {
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	public String toString() {
		return "Student [name=" + name + "]";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student("Mohan");
		Student s2 = (Student) s1.clone();
		System.out.println(s2.toString());
		
		System.out.println(s2.getClass().getName()); // Outputs: Demo
		
		System.out.println(""+s2);
	}
    public int hashCode() {
        return Integer.hashCode(id);
    }
	
    
}