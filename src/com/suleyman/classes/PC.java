package com.suleyman.classes;

public class PC implements Device {
    private String RAM;
    private String CPU;
    private String HDD;

    public PC(String RAM, String CPU, String HDD) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.HDD = HDD;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }

    @Override
    public String getCPU() {
        return this.CPU;
    }

    @Override
    public String getInformation() {
        return "PC created with these Specifications:\n" + "RAM => " + getRAM() + "\n" + "CPU => "+ getCPU() + "\n" + "SSD => " + getHDD() + "\n";
    }


}
