package strategy;

import model.ContractEmployee;
import model.Employee;

import java.util.Scanner;

public class ContractEmployeeStrategy implements Strategy {

    public Employee buildEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = scanner.nextLine();
        System.out.println("Podaj wartość kontraktu: ");
        double contractCost = scanner.nextDouble();

        return new ContractEmployee.ContractEmployeeBuilder()
                .setName(name)
                .setSurname(surname)
                .setContractCost(contractCost)
                .build();
    }
}
