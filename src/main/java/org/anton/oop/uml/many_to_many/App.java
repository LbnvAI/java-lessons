package org.anton.oop.uml.many_to_many;

import java.time.LocalDate;

public class App {
    public static CarRide getRide(Customer customer, Car car) {
        CarRide carRide = new CarRide();
        carRide.setCustomer(customer);
        carRide.setCar(car);
        carRide.setStartedAt(LocalDate.now());
        return carRide;
    }
}
