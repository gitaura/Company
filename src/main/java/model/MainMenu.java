package model;

import app.Company;

import java.util.Scanner;

public class MainMenu {
    public static void start() {
        final int ADD_NEW_EMPLOYEE_OPTION = 1;
        final int REMOVE_EMPLOYEE_OPTION = 2;
        final int PRINT_EMPLOYEES_OPTION = 3;
        final int RAPORT_OPTION = 4;
        final int EXIT_MENU_OPTION = 0;

        int choice;
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        while (!exit) {

            System.out.println("Ad new employee: 1");
            System.out.println("Remove employee: 2");
            System.out.println("Print employes: 3");
            System.out.println("Create raport: 4");



            choice = scanner.nextInt();

            switch (choice) {
                case ADD_NEW_EMPLOYEE_OPTION:
                    StrategyManager.getStrategy();
                    break;
                case REMOVE_EMPLOYEE_OPTION:
                    Company.getInstance().removeEmployee();
                    break;
                case PRINT_EMPLOYEES_OPTION:
                    for (int i = 0; i < Company.getInstance().getEmployeeList().size(); i++) {
                        System.out.println(Company.getInstance().getEmployeeList());
                    }
                    break;
                case RAPORT_OPTION:
                    Company.getInstance().printRaport();
                    break;
                case EXIT_MENU_OPTION:
                    exit = true;
                    break;

            }
        }
    }
}
