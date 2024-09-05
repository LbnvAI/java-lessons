package org.anton.oop.uml;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Department {
    private String title;
    private List<Employee> employees;

    public Department(String title) {
        this.title = title;
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee emp) {
        emp.setDepartment(this);
        employees.add(emp);
    }

    public void removeEmployee(Employee emp) {
        emp.setDepartment(null);
        employees.remove(emp);
    }
}
