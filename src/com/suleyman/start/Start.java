package com.suleyman.start;

import com.suleyman.classes.Device;
import com.suleyman.factory.DeviceFactory;
import com.suleyman.factory.DeviceType;

public class Start {

    public static void main(String[] args){
        Device macbook = DeviceFactory.createDevice(DeviceType.MAC,"16GB","1TB","Apple M1");
        Device server = DeviceFactory.createDevice(DeviceType.SERVER,"240GB","120TB","intel xenon");

        System.out.println(macbook.getInformation());
        System.out.println(server.getInformation());
    }


}
