package patterns.structuralPatterns.bridge;

public class Remote {
    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public String togglePower(){
        if (device.isEnabled()){
            device.disable();
            return "device is disabled";
        }
        device.enable();
        return "device is enabled";
    }
}
