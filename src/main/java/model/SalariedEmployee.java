package model;

public class SalariedEmployee extends Employee {

    private double monathlySalary;

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
                "monathlySalary=" + calculatePaycheck() +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                '}';
    }

    @Override
    public double calculatePaycheck() {
        return monathlySalary * 0.77;
    }

    public static class SalariedEmployeeBuilder {
        private String name;
        private String surname;
        private double monathlySalary;

        public SalariedEmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public SalariedEmployeeBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public SalariedEmployeeBuilder setMonathlySalary(double monathlySalary) {
            this.monathlySalary = monathlySalary;
            return this;
        }


        public SalariedEmployee build (){
            return new SalariedEmployee(name, surname,monathlySalary);
        }
    }


}

