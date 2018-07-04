package Model;

public class CompanyApp {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Jan", "Kowalski", 5000);
        System.out.println(salariedEmployee1.calculatePaycheck());

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Piotr", "Nowak", 20, 20);

        ContractEmployee contractEmployee1 = new ContractEmployee("s", "sg", 2380);
    }
}

