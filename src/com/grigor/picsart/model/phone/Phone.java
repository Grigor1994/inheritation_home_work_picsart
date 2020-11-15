package com.grigor.picsart.model.phone;

import com.grigor.picsart.model.electronic.ElectronicItem;

public class Phone extends ElectronicItem {
    public Phone(String brand, String model, String serialNumber, int produceYear, int weight, double cost) {
    }

    public Phone(String brand, String model, String serialNumber, int produceYear, int weight) {
        super(brand, model, serialNumber, produceYear, weight);
    }

    public void call(String name) {
        System.out.println("Calling " + name);
    }

    public void hangUp() {
        System.out.println("End call...");
    }

    public void printPhoneInfo() {
        System.out.println("Brand: " + getBrand() + "\n Model: " + getModel() + "\n Serial No: " + getSerialNumber()
                + "\n Produce year: " + getProduceYear() + "\n Weight: " + getWeight() + " g.");
    }
}
