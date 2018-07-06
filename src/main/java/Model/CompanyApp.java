package Model;

import strategy.SalariedEmployeeStrategy;
import strategy.Strategy;

import java.util.Scanner;

public class CompanyApp {

    public static void main(String[] args) {

        Strategy strategy;

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Jan", "Kowalski", 5000);
        System.out.println(salariedEmployee1.calculatePaycheck());

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Piotr", "Nowak", 20, 20);

        ContractEmployee contractEmployee1 = new ContractEmployee("s", "sg", 2380);

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        System.out.println("1. Zbuduj SalariedEmployee");
        System.out.println("2. Zbuduj HourlyEmployee");
        System.out.println("3. Zbuduj ContractEmployee");

        switch (input) {
            case 1:
                strategy = new SalariedEmployeeStrategy();
                break;
            case 2:
                strategy = null;
                break;
            case 3:
                strategy = null;
            default:
                return;
        }

        Employee employee = strategy.buildEmployee();
        System.out.println(employee);

    }


}


