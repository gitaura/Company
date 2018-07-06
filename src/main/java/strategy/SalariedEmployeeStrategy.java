package strategy;

import Model.Employee;
import Model.SalariedEmployee;

import java.util.Scanner;

public class SalariedEmployeeStrategy implements Strategy {

    public Employee buildEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = scanner.nextLine();
        System.out.println("Podaj pensję: ");
        double salary  = scanner.nextDouble();

        return new SalariedEmployee.SalariedEmployeeBuilder()
                .setName(name)
                .setSurname(surname)
                .setMonathlySalary(salary)
                .build();

    }
}
