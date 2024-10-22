package org.anton.oop.pattern_builder;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class Computer {
    private int ram;
    private double cpu;
    private int ssd;
    private int hdd;
    private int power;
    private boolean hasCdDrive;
    private String videoAdapterType;

    // Return computer parameters as String
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ram: ").append(ram).append("\n");
        sb.append("cpu: ").append(cpu).append("\n");
        sb.append("ssd: ").append(ssd).append("\n");
        sb.append("hdd: ").append(hdd).append("\n");
        sb.append("power: ").append(power).append("\n");
        sb.append("hasCdDrive: ").append(hasCdDrive).append("\n");
        sb.append("videoAdapterType: ").append(videoAdapterType).append("\n");
        return sb.toString();
    }
}
