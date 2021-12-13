package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicTest {
    String line;

    @Test
    void convertLine0(){
        line = "bics r0, #0";
        Bic bic = new Bic(line);

        String res = bic.convert();

        Assertions.assertEquals("0100001110000000", res);
    }

    @Test
    void convertLine1(){
        line = "cmp r6, r2";
        Bic bic = new Bic(line);

        String res = bic.convert();

        Assertions.assertEquals("0100001110010110", res);
    }
}