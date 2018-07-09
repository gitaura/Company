package app;

import com.google.gson.Gson;
import model.Employee;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

    List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Company setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
        return this;
    }

    public static Company getInstance() {
        return CompanySingleton.INSTANCE;
    }

    public void printRaport() {

        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + " " + employee.calculatePaycheck());
        }

        Gson gson = new Gson();
        String json = gson.toJson(employeeList);
        System.out.println(employeeList);

        File file = new File("Raport_płatności");

    }

    private static class CompanySingleton {
        private static final Company INSTANCE = new Company();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }


    public void removeEmployee() {
        int index = 0;

        for (Employee employee : employeeList) {
            System.out.println(index + " " + employee.toString());
            index++;
        }

        Scanner scanner = new Scanner(System.in);
        index = scanner.nextInt();
        employeeList.remove(index);
    }
}


