package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SbcTest {
    String line;

    @Test
    void convertLine0(){
        line = "sbcs r0, r0";
        Sbc sbc = new Sbc(line);

        String res = sbc.convert();

        Assertions.assertEquals("0100000110000000", res);
    }

    @Test
    void convertLine1(){
        line = "sbcs r5, r1";
        Sbc sbc = new Sbc(line);

        String res = sbc.convert();

        Assertions.assertEquals("0100000110001101", res);
    }
}