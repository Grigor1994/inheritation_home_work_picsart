package com.grigor.picsart.model.tv;

import com.grigor.picsart.model.electronic.ElectronicItem;

public class TV extends ElectronicItem {
    private String display;
    private int responseTime;
    private int screenDiagonal;
    private String matrixType;

    public TV(String brand, String model, String serialNumber, int produceYear, int weight, String display, int responseTime, int screenDiagonal, String matrixType) {
        super(brand, model, serialNumber, produceYear, weight);
        this.display = display;
        this.responseTime = responseTime;
        this.screenDiagonal = screenDiagonal;
        this.matrixType = matrixType;
    }

    public void printTvInfo() {
        System.out.println("Brand: " + getBrand() + "\n Model: " + getModel() + "\n Serial No: " + getSerialNumber()
                + "\n Produce year: " + getProduceYear() + "\n Weight: " + getWeight() + " kg." + "\n Display: " + display + "\n Response time: " + responseTime + "hz"
                + "\n Screen Diagonal: " + screenDiagonal + " inch" + "\n Matrix type: " + matrixType);
    }

    public void showTvProgram() {
        System.out.println("Show tv program");
    }
}
