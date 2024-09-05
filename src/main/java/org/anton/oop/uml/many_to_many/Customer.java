package org.anton.oop.uml.many_to_many;

import java.util.List;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class Customer {

    private String name;
    private List<CarRide> rides;

    public Customer(String name) {
        this.name = name;
        rides = new ArrayList<>();
    }

    public void addRide(CarRide ride) {
        rides.add(ride);
    }
}
