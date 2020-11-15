package com.grigor.picsart.model.electronic;

public class ElectronicItem {
    private String brand;
    private String model;
    private String serialNumber;
    private int produceYear;
    private int weight;

    public ElectronicItem() {
    }

    public ElectronicItem(String brand, String model, String serialNumber, int produceYear, int weight) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.produceYear = produceYear;
        this.weight = weight;
    }

    public void turnOn() {
        System.out.println("Turn on");
    }

    public void turnOff() {
        System.out.println("Switch off");
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public String getSerialNumber() {
        return serialNumber;
    }


    public int getProduceYear() {
        return produceYear;
    }


    public int getWeight() {
        return weight;
    }

}
