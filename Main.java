interface Switchable {
    void turnOn();
    void turnOff();
}

interface Connectable {
    void connect();
    void disconnect();
}

interface Monitorable {
    void showStatus();
}

class SmartDevice implements Switchable, Connectable, Monitorable {

    private boolean isOn = false;
    private boolean isConnected = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Device turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Device turned OFF.");
    }

    @Override
    public void connect() {
        isConnected = true;
        System.out.println("Device connected to Wi-Fi.");
    }

    @Override
    public void disconnect() {
        isConnected = false;
        System.out.println("Device disconnected from Wi-Fi.");
    }

    @Override
    public void showStatus() {
        System.out.println("Power: " + (isOn ? "ON" : "OFF"));
        System.out.println("Connection: " +
                (isConnected ? "Connected" : "Disconnected"));
    }
}

public class Main {
    public static void main(String[] args) {

        SmartDevice device = new SmartDevice();

        device.turnOn();
        device.connect();
        device.showStatus();

        System.out.println("\nDisconnecting device...");

        device.disconnect();
        device.turnOff();
        device.showStatus();
    }
}