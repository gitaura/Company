package Model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List <Employee> employeeList = new ArrayList ();


    public static Company getInstance() {
        return CompanySingleton.INSTANCE;
    }
    private static class CompanySingleton {
        private static final Company INSTANCE = new Company();
    }


    public void addEmployee (Employee employee) {
        employeeList.add(employee);
    }


    public void removeEmployee (int index) {
        employeeList.remove(index);
    }

    }
