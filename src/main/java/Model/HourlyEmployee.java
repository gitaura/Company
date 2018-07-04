package Model;

public class HourlyEmployee extends Employee {
    double hoursWorked;
    double hourlyCost;


    public HourlyEmployee(String name, String surname, double hoursWorked, double hourlyCost) {
        super(name, surname);
        this.hoursWorked = hoursWorked;
        this.hourlyCost = hourlyCost;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyCost() {
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

    @Override
    public double calculatePaycheck() {
        return hourlyCost * hoursWorked;
    }

    static class HourlyEmployeeBuilder {
        private String name;
        private String surname;
        private double hoursWorked;
        private double hourlyCost;

        public HourlyEmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public HourlyEmployeeBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public HourlyEmployeeBuilder setHoursWorked(double hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public HourlyEmployeeBuilder setHourlyCost(double hourlyCost) {
            this.hourlyCost = hourlyCost;
            return this;
        }

        public HourlyEmployee build (){
            return new HourlyEmployee(name, surname,hoursWorked,hoursWorked);
        }

    }
}
