package Model;

import java.util.UUID;

public abstract class Employee {
    private String name;
    private String surname;
    private UUID id;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        id = UUID.randomUUID();
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

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
