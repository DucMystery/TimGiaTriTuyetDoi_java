import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbsoluteNumberCalculatorTest {

    @Test

    public void testAbsolute1(){
        int x= 0;
        int exp =0;
        AbsoluteNumberCalculator absoluteNumberCalculator = new AbsoluteNumberCalculator();

        assertEquals(exp,absoluteNumberCalculator.findAbsolute(x));
    }

    @Test

    public void testAbsolute2(){
        int x= 1;
        int exp =1;
        AbsoluteNumberCalculator absoluteNumberCalculator = new AbsoluteNumberCalculator();

        assertEquals(exp,absoluteNumberCalculator.findAbsolute(x));
    }

    @Test

    public void testAbsolute3(){
        int x= -1;
        int exp =1;
        AbsoluteNumberCalculator absoluteNumberCalculator = new AbsoluteNumberCalculator();

        assertEquals(exp,absoluteNumberCalculator.findAbsolute(x));
    }


}