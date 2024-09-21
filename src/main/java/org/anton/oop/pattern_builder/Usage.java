package org.anton.oop.pattern_builder;

import org.anton.oop.pattern_builder.use_lombok.ComputerLombokBuilder;

public class Usage {
    public static void useBuilder() {

        // Use standard version
        ComputerBuilder cb = new ComputerBuilder();
        Computer PC1 = cb.withCpu(4.8)
                .withHasCdDrive(false)
                .withHdd(500)
                .withPower(850)
                .withRam(16)
                .withSsd(256)
                .withVideoAdapterType("HDMI")
                .build();
        System.out.println(PC1.toString());

        // Use lombok version
        ComputerLombokBuilder PC2 = ComputerLombokBuilder.builder()
                .ram(16)
                .ssd(256)
                .videoAdapterType("USB")
                .cpu(2)
                .build();
        System.out.println(PC2.toString());
    }
}
