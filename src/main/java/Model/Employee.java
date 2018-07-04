package Model;

import java.util.UUID;

public abstract class Employee {
    String name;
    String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public double calculatePaycheck() {
        return 0;
    }

    public void editData() {
        return;
    }

}
