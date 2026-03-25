package q3;
class Building {
    protected int squareFootage;
    protected int stories;
    public Building() { 
    	this(0, 0); 
    }
    public Building(int sqFt, int stories) {
        this.squareFootage = sqFt;
        this.stories = stories;
    }
    public void display() {
        System.out.println("Square Footage: " + squareFootage + ", Stories: " + stories);
    }
}

class House extends Building {
    private int bedrooms;
    private int baths;
    public House() { 
    	super(); 
    }
    public House(int sqFt, int stories, int beds, int baths) {
        super(sqFt, stories);
        this.bedrooms = beds;
        this.baths = baths;
    }
    public void display() {
        super.display();
        System.out.println("Bedrooms: " + bedrooms + ", Baths: " + baths);
    }
}

class School extends Building {
    private int classrooms;
    private String gradeLevel;
    public School() { 
    	super(); 
    }
    public School(int sqFt, int stories, int classrooms, String level) {
        super(sqFt, stories);
        this.classrooms = classrooms;
        this.gradeLevel = level;
    }
    public void display() {
        super.display();
        System.out.println("Classrooms: " + classrooms + ", Grade Level: " + gradeLevel);
    }
}
public class BuildingDemo {
    public static void main(String[] args) {
        House myHome = new House(2500, 2, 4, 3);
        School mySchool = new School(50000, 3, 30, "Elementary");
        System.out.println("House Details ---");
        myHome.display();
        System.out.println("School Details ---");
        mySchool.display();
    }
}