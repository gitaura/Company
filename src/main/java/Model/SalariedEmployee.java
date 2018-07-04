package Model;

import java.util.Objects;
import java.util.UUID;

public class SalariedEmployee extends Employee {

    double monathlySalary;

    public SalariedEmployee(String name, String surname, double monathlySalary) {
        super(name, surname);
        this.monathlySalary = monathlySalary;
    }

    public double getMonathlySalary() {
        return monathlySalary;
    }

    public void setMonathlySalary(double monathlySalary) {
        this.monathlySalary = monathlySalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalariedEmployee that = (SalariedEmployee) o;
        return Double.compare(that.monathlySalary, monathlySalary) == 0;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monathlySalary=" + monathlySalary +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
