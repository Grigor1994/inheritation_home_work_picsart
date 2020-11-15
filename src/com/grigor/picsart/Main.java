package com.grigor.picsart;

import com.grigor.picsart.model.phone.MobilePhone;
import com.grigor.picsart.model.phone.SmartPhone;
import com.grigor.picsart.model.tv.SmartTV;
import com.grigor.picsart.model.tv.TV;
import com.grigor.picsart.service.PhoneService;
import com.grigor.picsart.service.TvService;

public class Main {

    public static void main(String[] args) {
        PhoneService phoneService = new PhoneService();
        TvService tvService = new TvService();

        SmartPhone smartPhone = phoneService.createSmartPhone("Iphone", "11 Pro", "56151L459I", 2019,
                190, "IOS", 5400, "Super Amoled", "4G+", true,
                true, false, true,
                true, true, 64000, true, true, true, true);

        smartPhone.printPhoneInfo();
        smartPhone.turnOn();
        System.out.println("---------------------------------------------");
        smartPhone.call("Maria");
        smartPhone.hangUp();
        smartPhone.takePhoto();
        smartPhone.shootVideo();
        smartPhone.turOff();
        System.out.println("---------------------------------------------");
        MobilePhone mobilePhone = phoneService.createMobilePhone("Nokia", "6233", "744545L44E",
                2005, 103, "S40", 900,
                "TFT", "GSM 850", false, false, true,
                true, false, true, 32);

        mobilePhone.printPhoneInfo();
        System.out.println("---------------------------------------------");
        mobilePhone.turnOn();
        mobilePhone.call("Eric");
        mobilePhone.hangUp();
        mobilePhone.takePhoto();
        mobilePhone.turOff();

        System.out.println("---------------------------------------------");

        TV regularTv = tvService.createTv("LG", "43UJ630V", "TV15632EL53", 2009, 5,
                "LCD", 75, 43, "MVA ");
        regularTv.printTvInfo();
        regularTv.turnOn();
        regularTv.showTvProgram();
        regularTv.turOff();

        System.out.println("-------------------------------------------------");
        SmartTV smartTV = tvService.createSmartTv("Sony", "ZG9 | MASTER Series", "S15894777LE7", 2020, 7,
                "OLED", 120, 54, "IPS", "Android", true, true);
        smartTV.printTvInfo();
        smartTV.turnOn();
        smartTV.showTvProgram();
        smartTV.playGame();
        smartTV.entryToInternet();
        smartTV.turOff();
    }
}
