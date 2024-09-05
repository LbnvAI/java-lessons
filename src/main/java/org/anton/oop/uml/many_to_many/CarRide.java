package org.anton.oop.uml.many_to_many;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class CarRide {
    private Customer customer;
    private Car car;
    private LocalDate startedAt;
    private LocalDate finishedAt;

    public void setCar(Car car) {
        this.car = car;
        car.addRide(this);
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
        customer.addRide(this);
    }
}
