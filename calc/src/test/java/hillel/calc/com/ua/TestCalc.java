package hillel.calc.com.ua;


        import static org.junit.Assert.*;
        import org.junit.Test;

/**
 * Created by cobra on 08.09.2016.
 */
public class TestCalc {

    @Test
    public void testAddition() {
        String operation = "+";
        int operand1 = 3;
        int operand2 = 5;
        int expectedResult = 8;
        int actualResult = Calc.give(operation, operand1, operand2);
        assertEquals("The result was wrong", expectedResult, actualResult);
    }
    @Test
    public void testShare() {
        String operation = "/";
        int operand1 = 40;
        int operand2 = 5;
        int expectedResult = 8;
        int actualResult = Calc.give(operation, operand1, operand2);
        assertEquals("The result was wrong", expectedResult, actualResult);
    }
    @Test
    public void testDeduct() {
        String operation = "-";
        int operand1 = 10;
        int operand2 = 5;
        int expectedResult = 5;
        int actualResult = Calc.give(operation, operand1, operand2);
        assertEquals("The result was wrong", expectedResult, actualResult);
    }
     @Test
    public void testOstatok() {
        String operation = "%";
        int operand1 = 40;
        int operand2 = 5;
        int expectedResult = 0;
        int actualResult = Calc.give(operation, operand1, operand2);
        assertEquals("The result was wrong", expectedResult, actualResult);
    }
    @Test
    public void testMod() {
        int operand1 = -3;
        int expectedResult = 3;
        int actualResult = Calc.modul (operand1);
        assertEquals("The result was wrong", expectedResult, actualResult);
    }

    @Test
    public void testMultiply() {
        String operation = "*";
        int operand1 = 3;
        int operand2 = 3;
        int expectedResult = 9;
        int actualResult = Calc.give(operation, operand1, operand2);
        assertEquals("The result was wrong", expectedResult, actualResult);
    }
}