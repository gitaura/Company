package model;

import app.Company;
import strategy.ContractEmployeeStrategy;
import strategy.HourlyEmployeeStrategy;
import strategy.SalariedEmployeeStrategy;
import strategy.Strategy;

import java.util.Scanner;

public class StrategyManager {

    public static void getStrategy() {

        Strategy strategy;

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Zbuduj SalariedEmployee");
        System.out.println("2. Zbuduj HourlyEmployee");
        System.out.println("3. Zbuduj ContractEmployee");

        int input = scanner.nextInt();
        switch (input) {
            case 1:
                strategy = new SalariedEmployeeStrategy();
                break;
            case 2:
                strategy = new HourlyEmployeeStrategy();
                break;
            case 3:
                strategy = new ContractEmployeeStrategy();
                break;
            default:
                return;
        }

        Employee employee = strategy.buildEmployee();
        Company.getInstance().addEmployee(employee);
    }
}


