package com.suleyman.classes;

public class Mac implements Device {

    private String RAM;
    private String CPU;
    private String HDD;
    private String GPU;

    public Mac(String RAM, String CPU, String HDD,String GPU) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.HDD = HDD;
        this.GPU = GPU;
    }

    public String getGPU() {
        return this.GPU;
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
    public String getInformation(){
        return "Macbook created with these Specifications:\n" + "RAM => " + getRAM() + "\n" + "CPU => "+ getCPU() + "\n" + "SSD => " + getHDD() + "\n";
     }
}
