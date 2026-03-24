interface SharedConstants { //can be default or public only. CANNOT be private , protected
	int NO = 0;//only public, static & final are permitted
	int YES = 1;
	int MAYBE = 2;
    int LATER = 3;
}

class MyClass1 implements SharedConstants {
    int x;
    MyClass1() {
        x = 1;
    }
    int fun() {
        if (x > 1) {
        	NO=1;
        }

}