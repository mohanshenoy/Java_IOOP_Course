class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    int  getTime() {
        return 1;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();

        c.setTime("1245");
        c.getTime();
        System.out.println("");
    }
}