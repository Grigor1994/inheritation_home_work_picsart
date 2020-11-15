package com.grigor.picsart.service;

import com.grigor.picsart.model.phone.MobilePhone;
import com.grigor.picsart.model.phone.SmartPhone;

public class PhoneService {

    public SmartPhone createSmartPhone(String brand, String model, String serialNumber, int produceYear, int weight,
                                       String operationSystem, int batteryCapacity, String display, String networkType,
                                       boolean isDualSim, boolean isTouchScreen, boolean isMemoryCardSlot, boolean isMainCamera,
                                       boolean isSelfieCamera, boolean bluetooth, int memory, boolean isWiFi, boolean isGps,
                                       boolean isFingerPrint, boolean isFaceId) {
        return new SmartPhone(brand, model, serialNumber, produceYear, weight, operationSystem, batteryCapacity, display, networkType,
                isDualSim, isTouchScreen, isMemoryCardSlot, isMainCamera, isSelfieCamera, bluetooth, memory, isWiFi, isGps, isFingerPrint, isFaceId);
    }

    public MobilePhone createMobilePhone(String brand, String model, String serialNumber, int produceYear, int weight,
                                         String operationSystem, int batteryCapacity, String display, String networkType,
                                         boolean isDualSim, boolean isTouchScreen, boolean isMemoryCardSlot, boolean isMainCamera,
                                         boolean isSelfieCamera, boolean bluetooth, int memory) {
        return new MobilePhone(brand, model, serialNumber, produceYear, weight, operationSystem, batteryCapacity, display, networkType, isDualSim, isTouchScreen, isMemoryCardSlot, isMainCamera, isSelfieCamera, bluetooth, memory);
    }
}
