package org.anton.oop.pattern_builder;

public class ComputerBuilder {

    // Contains all Computer fields

    private int ram = 0;
    private double cpu = 0;
    private int ssd = 0;
    private int hdd = 0;
    private int power = 0;
    private boolean hasCdDrive = false;
    private String videoAdapterType = null;

    // Set ram and return 'updated' ComputerBuilder
    public ComputerBuilder withRam(int ram) {
        this.ram = ram;
        return this;
    }

    // Set cpu and return 'updated' ComputerBuilder
    public ComputerBuilder withCpu(double cpu) {
        this.cpu = cpu;
        return this;
    }

    // Set ssd and return 'updated' ComputerBuilder
    public ComputerBuilder withSsd(int ssd) {
        this.ssd = ssd;
        return this;
    }

    // Set hdd and return 'updated' ComputerBuilder
    public ComputerBuilder withHdd(int hdd) {
        this.hdd = hdd;
        return this;
    }

    // Set power and return 'updated' ComputerBuilder
    public ComputerBuilder withPower(int power) {
        this.power = power;
        return this;
    }

    // Set cdDrive and return 'updated' ComputerBuilder
    public ComputerBuilder withHasCdDrive(boolean hasCdDrive) {
        this.hasCdDrive = hasCdDrive;
        return this;
    }

    // Set videoAdapterType and return 'updated' ComputerBuilder
    public ComputerBuilder withVideoAdapterType(String videoAdapterType) {
        this.videoAdapterType = videoAdapterType;
        return this;
    }

    // Put values of fields in Computer constructor and return configured instance of Computer
    public Computer build() {
        return new Computer(ram, cpu, ssd, hdd, power, hasCdDrive, videoAdapterType);
    }
}
