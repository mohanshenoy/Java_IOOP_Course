package notused;

class Device {
    final String type = "Generic";
    Device() { 
    	System.out.print("InitDevice "); 
    }
    public String toString() { 
    	return "Device=" + type; 
    }
}
class Sensor extends Device {
    final String type = "Temp";
    Sensor() { 
    	System.out.print("InitSensor "); 
    }
    public String toString() { 
    	return "Sensor=" + type; 
    }
}
public class DeviceDemo {
    public static void main(String[] args) {
        Device d = new Sensor();
        System.out.print(d);
    }
}

//A) InitDevice InitSensor Sensor=Temp ***
//B) InitSensor InitDevice Sensor=Temp
//C) InitDevice InitSensor Device=Generic
//D) InitDevice InitSensor Device=Generic
