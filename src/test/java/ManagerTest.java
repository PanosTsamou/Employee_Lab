import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager employee;

    @Before
    public void setUp(){
        employee = new Manager("Aric", "BB2354", 45000, "Human Resources");
    }
    @Test
    public  void hasName(){
        assertEquals("Aric", employee.getName());
    }
    @Test
    public void hasNINumber(){
        assertEquals("BB2354", employee.getNiNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(45000.00, employee.getSalary(),.0);
    }
    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(500);
        assertEquals(45500, employee.getSalary(),.0);
    }
    @Test
    public void canBonus(){
        assertEquals(450, employee.payBonus(), .0);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Human Resources", employee.getDeptName());
    }

    @Test
    public void canChangeName(){
        employee.setName("Panos");
        assertEquals("Panos", employee.getName());
    }
    @Test
    public void cantChangeNameIfNull(){
        employee.setName(null);
        assertEquals("Aric", employee.getName());
    }
    @Test
    public void cantChangeNameIfEmptyString(){
        employee.setName("");
        assertEquals("Aric", employee.getName());
    }
}