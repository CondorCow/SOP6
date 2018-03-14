import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyUnitTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "eight");

        assertEquals("oneeight", result);
    }

    @Test
    public void testGiveSalary(){
        MyUnit myUnit = new MyUnit();
        myUnit.giveMoney(200);

        assertEquals(200.0, myUnit.getEmployeeSalary());
    }

    @Test
    public void testEmployeeInfo(){
        MyUnit myUnit = new MyUnit();
        myUnit.giveMoney(200);
        assertEquals("Henk - 30 200.0", myUnit.getEmployeeInfo());
    }

    @Test
    public void testEmptySalaryOnInit(){
        MyUnit myUnit = new MyUnit();
        Assert.assertEquals(0, myUnit.getEmployeeSalary(), DELTA);
    }
}
