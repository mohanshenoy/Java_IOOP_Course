interface SharedConstants { //can be default or public only. CANNOT be private , protected
	int NO = 0;//only public, static & final are permitted
	int YES = 1;
	int MAYBE = 2;
    int LATER = 3;
}

class Class1 implements SharedConstants {
    int x;
    Class1() {
        x = 1;
    }
    int fun() {
        if (x > 1)
            return NO;
        else
            return YES;
    }
}