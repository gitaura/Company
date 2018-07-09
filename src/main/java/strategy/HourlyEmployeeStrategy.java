package strategy;

import model.Employee;
import model.HourlyEmployee;

import java.util.Scanner;

public class HourlyEmployeeStrategy implements Strategy {

    @Override
    public Employee buildEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = scanner.nextLine();
        System.out.println("Podaj liczbę przepracowanych godzin: ");
        double hoursWorked = scanner.nextDouble();
        System.out.println("Podaj wynagrodzenie za godzinę: ");
        double hourlyCost = scanner.nextDouble();


        return new HourlyEmployee.HourlyEmployeeBuilder()
                .setName(name)
                .setSurname(surname)
                .setHoursWorked(hoursWorked)
                .setHourlyCost(hourlyCost)
                .build();
    }
}
