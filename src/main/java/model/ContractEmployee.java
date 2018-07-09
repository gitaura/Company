package model;

public class ContractEmployee extends Employee {
    double contractCost;

    public ContractEmployee(String name, String surname, double contractCost) {
        super(name, surname);
        this.contractCost = contractCost;
    }

    public double getContractCost() {
        return contractCost;
    }

    public void setContractCost(int contractCost) {
        this.contractCost = contractCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContractEmployee that = (ContractEmployee) o;
        return contractCost == that.contractCost;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "contractCost=" + contractCost +
                ", name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                '}';
    }

    @Override
    public double calculatePaycheck() {
        return contractCost * 0.85;
    }

    public static class ContractEmployeeBuilder {
        private String name;
        private String surname;
        private double contractCost;

        public ContractEmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ContractEmployeeBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public ContractEmployeeBuilder setContractCost(double contractCost) {
            this.contractCost = contractCost;
            return this;
        }

        public ContractEmployee build() {
            return new ContractEmployee(name, surname, contractCost);
        }
    }
}
