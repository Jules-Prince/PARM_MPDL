package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TstTest {
    String line;

    @Test
    void convertLine0(){
        line = "tst r0, r0";
        Tst tst = new Tst(line);

        String res = tst.convert();

        Assertions.assertEquals("0100001000000000", res);
    }

    @Test
    void convertLine1(){
        line = "tst r2, r6";
        Tst tst = new Tst(line);

        String res = tst.convert();

        Assertions.assertEquals("0100001000110010", res);
    }
}