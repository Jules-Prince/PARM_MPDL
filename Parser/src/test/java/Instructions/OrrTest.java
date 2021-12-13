package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrrTest {
    String line;

    @Test
    void convertLine0(){
        line = "orrs r0, r0";
        Orr orr = new Orr(line);

        String res = orr.convert();

        Assertions.assertEquals("0100001100000000", res);
    }

    @Test
    void convertLine1(){
        line = "orrs r4, r2";
        Orr orr = new Orr(line);

        String res = orr.convert();

        Assertions.assertEquals("0100001100010100", res);
    }
}