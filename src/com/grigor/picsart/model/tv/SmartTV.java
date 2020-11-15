package com.grigor.picsart.model.tv;

public class SmartTV extends TV {
    private String operatingSystem;
    private boolean WiFi;
    private boolean bluetooth;


    public SmartTV(String brand, String model, String serialNumber, int produceYear, int weight, String display, int responseTime, int screenDiagonal, String matrixType, String operatingSystem, boolean wiFi, boolean bluetooth) {
        super(brand, model, serialNumber, produceYear, weight, display, responseTime, screenDiagonal, matrixType);
        this.operatingSystem = operatingSystem;
        WiFi = wiFi;
        this.bluetooth = bluetooth;
    }

    @Override
    public void printTvInfo() {
        super.printTvInfo();
        System.out.println("Operating system: " + operatingSystem + "\n WiFi: " + WiFi + "\n Bluetooth: " + bluetooth);
    }

    public void entryToInternet() {
        System.out.println("Entry to Youtube.");
    }

    public void playGame() {
        System.out.println("Playing game.");
    }
}
