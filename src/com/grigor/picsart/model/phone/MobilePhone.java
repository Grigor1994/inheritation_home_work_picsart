package com.grigor.picsart.model.phone;

public class MobilePhone extends Phone {
    private String operatingSystem;
    private int batteryCapacity;
    private String display;
    private String networkType;
    private boolean isDualSim;
    private boolean isTouchScreen;
    private boolean isMemoryCardSlot;
    private boolean isMainCamera;
    private boolean isSelfieCamera;
    private boolean bluetooth;
    private int memory;



    public MobilePhone(String brand, String model, String serialNumber, int produceYear, int weight, String operationSystem,
                       int batteryCapacity, String display, String networkType, boolean isDualSim, boolean isTouchScreen,
                       boolean isMemoryCardSlot, boolean isMainCamera, boolean isSelfieCamera, boolean bluetooth, int memory) {
        super(brand, model, serialNumber, produceYear, weight);
        this.operatingSystem = operationSystem;
        this.batteryCapacity = batteryCapacity;
        this.display = display;
        this.networkType = networkType;
        this.isDualSim = isDualSim;
        this.isTouchScreen = isTouchScreen;
        this.isMemoryCardSlot = isMemoryCardSlot;
        this.isMainCamera = isMainCamera;
        this.isSelfieCamera = isSelfieCamera;
        this.bluetooth = bluetooth;
        this.memory = memory;
    }

    public void takePhoto() {
        System.out.println("Take a photo");
    }

    public void shootVideo() {
        System.out.println("Shoot a video");
    }

    @Override
    public void printPhoneInfo() {
        super.printPhoneInfo();
        System.out.println("OS: " + operatingSystem + "\n Battery capacity: " + batteryCapacity + " mAh." + "\n Display: " + display
                + "\n Network: " + networkType + "\n Dual sim: " + isDualSim + "\n Touch screen: " + isTouchScreen
                + "\n Memory card: " + isMemoryCardSlot + "\n Main camera: " + isMainCamera + "\n Selfie camera: " + isSelfieCamera
                + "\n Bluetooth: " + bluetooth + "\n Memory: " + memory + " mb.");
    }

}
