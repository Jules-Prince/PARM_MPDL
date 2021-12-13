package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EorTest {
    String line;

    @Test
    void convertLine0(){
        line = "eors r0, r0";
        Eor eor = new Eor(line);

        String res = eor.convert();

        Assertions.assertEquals("0100000001000000", res);
    }

    @Test
    void convertLine1(){
        line = "eors r4, r1";
        Eor eor = new Eor(line);

        String res = eor.convert();

        Assertions.assertEquals("0100000001001100", res);
    }
}