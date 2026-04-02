interface PowerState {
    int BASE_VOLTAGE = 110;
    void togglePower();
}
abstract class Appliance implements PowerState {
    public void togglePower() {
        System.out.print("AppPowerOn ");
    }
    abstract void performFunction();
}
class Microwave extends Appliance {
    Microwave() { System.out.print("InitMicrowave "); }
    public void togglePower() {
        System.out.print("MicroPower:" + (BASE_VOLTAGE * 2) + " ");
    }
    public void performFunction() {
        System.out.print("Heating ");
    }
}
public class PowerDemo {
    public static void main(String[] args) {
        PowerState p = new Microwave();
        p.togglePower();
    }
}
//A) InitMicrowave MicroPower:220 ***
//B) InitMicrowave AppPowerOn
//C) InitMicrowave AppPowerOn MicroPower:220
//D) AppPowerOn MicroPower:220
