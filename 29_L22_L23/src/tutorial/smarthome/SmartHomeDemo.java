package tutorial.smarthome;

class SmartDevice {
    String deviceName;
    boolean powerStatus;
    
    SmartDevice(String name) { 
    	deviceName = name; 
    	powerStatus = false; 
    }
    void togglePower() {
        powerStatus = !powerStatus;
        System.out.println(deviceName + " is now " + (powerStatus ? "ON" : "OFF"));
    }
    void performAction() { 
    	System.out.println(deviceName + " is performing a generic action."); 
    }
}

class SmartLight extends SmartDevice {
    SmartLight(String name) { 
    	super(name); 
    }
    void performAction() {
        if (powerStatus) {  
            System.out.println(deviceName + " is adjusting brightness to 75%.");
        } else {
            System.out.println("Cannot adjust brightness: " + deviceName + " is OFF.");
        }
    }
}

class SmartThermostat extends SmartDevice {
    SmartThermostat(String name) { 
    	super(name); 
    }
    void performAction() {
        if (powerStatus) {
            System.out.println(deviceName + " is setting temperature to 22°C.");
        } else {
            System.out.println("Cannot set temperature: " + deviceName + " is OFF.");
        }
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        SmartDevice device; 
        device = new SmartLight("Living Room Light");
        device.togglePower();  
        device.performAction(); 

        device = new SmartThermostat("Main Hall HVAC");
        device.performAction(); 

    }
}