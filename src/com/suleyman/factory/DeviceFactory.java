package com.suleyman.factory;

import com.suleyman.classes.Device;
import com.suleyman.classes.Mac;
import com.suleyman.classes.PC;
import com.suleyman.classes.Server;

public class DeviceFactory {

    public static String getDeviceInfo(Device device){
        return " created with these specifications \n " + "RAM => " + device.getRAM() +
                "\n" + "CPU => "+ device.getCPU() + "\n" + "SSD => " + device.getHDD() + "\n";

    }

    public static Device createDevice(DeviceType type,String ram,String hdd,String cpu){
        Device newDevice = null;
        switch (type){
            case PC -> {
                newDevice = new PC(ram,hdd,cpu);

            }
            case MAC -> {
                String gpu="";
                newDevice = new Mac(ram,cpu,hdd,gpu);

            }
            case SERVER -> {
                String externalCPU ="";
                newDevice = new Server(ram,cpu,hdd,externalCPU);

            }

        }
        return newDevice;

    }



}
