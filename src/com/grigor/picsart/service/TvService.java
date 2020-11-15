package com.grigor.picsart.service;

import com.grigor.picsart.model.tv.SmartTV;
import com.grigor.picsart.model.tv.TV;

public class TvService {
    public TV createTv(String brand, String model, String serialNumber, int produceYear, int weight, String display, int responseTime, int screenDiagonal, String matrixType) {
        return new TV(brand, model, serialNumber, produceYear, weight, display, responseTime, screenDiagonal, matrixType);
    }

    public SmartTV createSmartTv(String brand, String model, String serialNumber, int produceYear, int weight, String display, int responseTime, int screenDiagonal,
                                 String matrixType, String operatingSystem, boolean wiFi, boolean bluetooth) {
        return new SmartTV(brand, model, serialNumber, produceYear, weight, display, responseTime, screenDiagonal, matrixType, operatingSystem, wiFi, bluetooth);
    }
}
