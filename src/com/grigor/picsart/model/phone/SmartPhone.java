package com.grigor.picsart.model.phone;

public class SmartPhone extends MobilePhone {
    private boolean isWiFi;
    private boolean isGps;
    private boolean isFingerPrint;
    private boolean isFaceId;


    public SmartPhone(String brand, String model, String serialNumber, int produceYear, int weight, String operationSystem, int batteryCapacity, String display, String networkType, boolean isDualSim, boolean isTouchScreen, boolean isMemoryCardSlot, boolean isMainCamera, boolean isSelfieCamera, boolean bluetooth, int memory, boolean isWiFi, boolean isGps, boolean isFingerPrint, boolean isFaceId) {
        super(brand, model, serialNumber, produceYear, weight, operationSystem, batteryCapacity, display, networkType, isDualSim, isTouchScreen, isMemoryCardSlot, isMainCamera, isSelfieCamera, bluetooth, memory);
        this.isWiFi = isWiFi;
        this.isGps = isGps;
        this.isFingerPrint = isFingerPrint;
        this.isFaceId = isFaceId;
    }

    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void printPhoneInfo() {
        super.printPhoneInfo();
        System.out.println("WiFi: " + isWiFi + "\n GPS: " + isGps + "\n Finger print: " + isFingerPrint
                + "\n Face ID: " + isFaceId);
    }
}
