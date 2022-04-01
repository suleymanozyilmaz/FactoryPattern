package com.suleyman.classes;

public class Server implements Device {

    private String RAM;
    private String CPU;
    private String HDD;
    private String externalCPU;

    public Server(String RAM, String CPU, String HDD,String externalCPU) {
        this.RAM = RAM;
        this.CPU = CPU;
        this.HDD = HDD;
        this.externalCPU = externalCPU;
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
        return "Server created with these Specifications:\n" + "RAM => " + getRAM() + "\n" + "CPU => "+ getCPU() + "\n" + "SSD => " + getHDD() + "\n";
    }

    public String getExternalCPU() {
        return this.externalCPU;
    }
}
