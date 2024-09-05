package org.anton.oop.uml.many_to_many;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.ArrayList;

@Getter
@Setter
public final class Car {
    private final String model;
    private final String vin;

    private List<CarRide> rides;

    public Car(String model, String vin) {
        this.model = model;
        this.vin = vin;
        rides = new ArrayList<>();
    }

    public void addRide(CarRide ride) {
        rides.add(ride);
    }

}
