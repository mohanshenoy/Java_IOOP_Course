package test8;

class Box {
    double width, height, depth;
    String label; 
    Box(double w, double h, double d, String label) {
        this.width = w;
        this.height = h;
        this.depth = d;
        this.label = label;
    }
    double volume() {
        return width * height * depth;
    }

    // Overriding toString() to print the object label and volume...
    public String toString() {
        return "Box[Name: " + label + ", Vol: " + volume() + "]";
    }
}
