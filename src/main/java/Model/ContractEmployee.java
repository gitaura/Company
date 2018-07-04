package Model;

import java.util.Objects;
import java.util.UUID;

public class ContractEmployee extends Employee {
    int contractCost;

    public ContractEmployee(String name, String surname, int contractCost) {
        super(name, surname);
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
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
