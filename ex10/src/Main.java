public class Main {
    public static void main(String[] args) {
        SmartLight light = new SmartLight("Bedroom Light", 70);
        SmartThermostat thermostat = new SmartThermostat("Living Room Thermostat", 22.5);
        light.connect();
        thermostat.connect();
        SmartHome.addDevice(light);
        SmartHome.addDevice(thermostat);
        SmartHome.showAllDevices();
        System.out.println("Total devices: " + SmartDevice.getDeviceCount());
        SmartSpeaker speaker = new SmartSpeaker("Kitchen Speaker");
        speaker.setVolumeLevel(55);
        speaker.connect();
        SmartHome.addDevice(speaker);
    }
}

interface Connectable{
    void connect();
    void disconnect();
}

abstract class SmartDevice implements Connectable{
    private String deviceName;
    public boolean isConnected;
    static int deviceCount = 0;
    SmartDevice(String name){
        this.deviceName=name;
        System.out.println(name+" Initialized.");
        deviceCount++;
    }
    public String getDeviceName(){
        return this.deviceName;
    }
    public void setDeviceName(String deviceName){
        this.deviceName=deviceName;
    }
    abstract void operate();
    public void showStatus(String status, String deviceName){
        System.out.println(deviceName+" , "+status);
    }
    static int getDeviceCount(){
        return deviceCount;
    }
    public void showStatus() {
        String status = isConnected ? "Connected" : "Disconnected";
        System.out.println(getDeviceName() + " Status: " + status);
    }

}

class SmartLight extends SmartDevice{
    private int brightnessLevel;
    SmartLight(String deviceName, int brightnessLevel) {
        super(deviceName);
        this.brightnessLevel = brightnessLevel;
        System.out.println(deviceName + " , " + brightnessLevel);
    }
    public int getBrightnessLevel(){
        return this.brightnessLevel;
    }
    public void setBrightnessLevel(int brightnessLevel){
        this.brightnessLevel = brightnessLevel;
    }
    @Override
    public void operate(){
        System.out.println("Turning the light on with brigthness: "+brightnessLevel);
    }
    @Override
    public void connect(){
        isConnected = true;
        System.out.println("Light Connected.");
    }
    @Override
    public void disconnect(){
        isConnected = false;
        System.out.println("Light Disconnected.");
    }
}

class SmartThermostat extends SmartDevice{
    private double temperature;
    SmartThermostat(String deviceName, double temperature){
        super(deviceName);
        this.temperature=temperature;
        System.out.println(deviceName+" , "+temperature);
    }
    @Override
    public void operate(){
        System.out.println("thermostat temp: "+temperature);
    }
    @Override
    public void connect(){
        isConnected = true;
        System.out.println("Thermostat Connected.");

    }
    @Override
    public void disconnect() {
        isConnected = false;
        System.out.println("Thermostat Disconnected.");
    }
    public double getTemperature(){
        return this.temperature;
    }
    public void setTemperature(double temperature){
        this.temperature=temperature;
    }
}

class SmartSecurityCamera extends SmartDevice{
    private boolean recording;
    SmartSecurityCamera(String deviceName){
        super(deviceName);
        System.out.println("Device Name: "+deviceName);
    }
    @Override
    public void operate(){
        if(recording){
            System.out.println("Recording ON");
        }
        else{
            System.out.println("Recording OFF");
        }
    }
    @Override
    public void connect() {
        isConnected = true;
        recording = true;
        System.out.println("Security Camera Connected.");
    }
    @Override
    public void disconnect() {
        isConnected = false;
        recording = false;
        System.out.println("Security Camera Disconnected.");
    }
}

class SmartHome {
    static SmartDevice[] devices = new SmartDevice[10];
    static int index = 0;

    public static void addDevice(SmartDevice device) {
        if (index < devices.length) {
            devices[index++] = device;
        }
    }

    public static void showAllDevices() {
        for (int i = 0; i < index; i++) {
            devices[i].showStatus();
            devices[i].operate();
            System.out.println();
        }
    }
    public static void disconnectAllDevices() {
        for (int i = 0; i < index; i++) {
            devices[i].disconnect();
        }
    }

}

class SmartSpeaker extends SmartDevice{
    private double volumeLevel;
    SmartSpeaker(String deviceName){
        super(deviceName);
    }
    public double getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(double volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void volume(double volumeLevel){
        System.out.println("Volume: "+volumeLevel);
    }
    public void playMusic(){
        System.out.println("Playing Music");
    }

    public void operate(){
        System.out.println("Playing music at Level: "+volumeLevel);
    }
    @Override
    public void connect() {
        System.out.println("Speaker Connected.");
    }
    @Override
    public void disconnect() {
        System.out.println("Speaker Disconnected.");
    }


}