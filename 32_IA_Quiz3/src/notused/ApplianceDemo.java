package notused;


class Gadget {
    int voltage = 110;
    void turnOn() { 
    	System.out.print("ApplianceOn "); 
    }
}
class Refrigerator extends Gadget {
    int voltage = 220;
    void turnOn() { 
    	System.out.print("MicrowaveOn "); 
    }
}
public class ApplianceDemo {
    public static void main(String[] args) {
    	Gadget app = new Refrigerator();
        app.turnOn();
        System.out.print(app.voltage);
    }
}
//A) ApplianceOn 110
//B) MicrowaveOn 220
//C) ApplianceOn 220
//D) MicrowaveOn 110***
