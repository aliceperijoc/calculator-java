import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before                                         
    public void setUp() {
        Calculator calculator = new Calculator();
    }
    
    @Test
    public void testRun() {
        assertEquals("Nu da suma care trebuie", "10.0" ,Calculator.Run("4+6"));
        assertEquals("Nu da diferenta care trebuie", "10.0" ,Calculator.Run("14-4"));
        assertEquals("Nu da produsul care trebuie", "10.0" ,Calculator.Run("2*5"));
        assertEquals("Nu da catul care trebuie", "10.0" ,Calculator.Run("40/4"));
        assertEquals("Nu da rezultatul care trebuie", "62.0" ,Calculator.Run("4+6*10-2/1"));
        assertEquals("Nu da rezultatul care trebuie", "-23.0" ,Calculator.Run("24/8*0-25+2"));
        assertEquals("Nu da rezultatul care trebuie", "1.062096E8" ,Calculator.Run("2300*2700-4000/10+100000000"));
    }

  
}
