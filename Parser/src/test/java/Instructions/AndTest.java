package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AndTest {
    String line;

    @Test
    void convertLine0(){
        line = "ands r0, #0";
        And and = new And(line);

        String res = and.convert();

        Assertions.assertEquals("0100000000000000", res);
    }

    @Test
    void convertLine1(){
        line = "ands r3, r1";
        And and = new And(line);

        String res = and.convert();

        Assertions.assertEquals("0100000000001011", res);
    }
}