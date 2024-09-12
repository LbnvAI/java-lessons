package org.anton.oop.pattern_builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class Pizza {
    private String size;
    private String dough;
    private String sauce;
    private String meatTopping;
    private String vegetableTopping;
    private String cheeseTopping;
}
