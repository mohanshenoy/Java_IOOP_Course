interface SharedConstants {
    int NO = 0;//only public, static & final are permitted
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
}

class A implements SharedConstants {
    int x;
    A() {
        x = 1;
    }
    int fun() {
        if (x > 1)
            return NO;
        else
            return YES;
    }
}