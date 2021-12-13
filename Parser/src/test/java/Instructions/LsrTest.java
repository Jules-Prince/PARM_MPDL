package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LsrTest {
    String line;

    @Test
    void convertLine0(){
        line = "lsrs r0, r0, #0";
        Lsr lsr = new Lsr(line);

        String res = lsr.convert();

        Assertions.assertEquals("0000100000000000", res);
    }

    @Test
    void convertLine1(){
        line = "lsrs r4, r2, #1";
        Lsr lsr = new Lsr(line);

        String res = lsr.convert();

        Assertions.assertEquals("0000100001010100", res);
    }
}