package slide19;

abstract class Super {
    int x;
    int getX() {
        return x;
    }
    abstract void setX(int newX); // no body
}
class Sub extends Super {
    void setX(int newX) {
        x = newX;
    }
}