import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest{
    private DatabaseAdmin employee;

    @Before
    public void setUp(){
        employee = new DatabaseAdmin("Aric", "BB2354", 45000);
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