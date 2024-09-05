package org.anton.collections;

import lombok.Getter;

// Triangle with sides validation
@Getter
public class Triangle {
    double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA + sideB <= sideC) throw new IllegalArgumentException("illegal side value");
        else if (sideB + sideC <= sideA) throw new IllegalArgumentException("illegal side value");
        else if (sideA + sideC <= sideB) throw new IllegalArgumentException("illegal side value");
        else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }
}
