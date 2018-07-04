package Model;

import java.util.Objects;
import java.util.UUID;

public class HourlyEmployee extends Employee {
    int hoursWorked;
    int hourlyCost;


    public HourlyEmployee(String name, String surname, int hoursWorked, int hourlyCost) {
        super(name, surname);
        this.hoursWorked = hoursWorked;
        this.hourlyCost = hourlyCost;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getHourlyCost() {
        return hourlyCost;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyCost(int hourlyCost) {
        this.hourlyCost = hourlyCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourlyEmployee that = (HourlyEmployee) o;
        return hoursWorked == that.hoursWorked &&
                hourlyCost == that.hourlyCost;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyCost=" + hourlyCost +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                '}';
    }
}
