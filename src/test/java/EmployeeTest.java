import model.SalariedEmployee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test

    public void schould_return_calculatePaycheck (){

        SalariedEmployee employee = new SalariedEmployee("Jan", "Kowalski", 5000);
        double expected = employee.calculatePaycheck();
        double actualy = 3850;
        Assert.assertEquals(expected, actualy, 0.001);
    }
}
