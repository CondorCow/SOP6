import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();

        String result = myUnit.concatenate("one", "seven");

        assertEquals("oneseven", result);

    }
}
