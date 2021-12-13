package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RsbTest {
    String line;

    @Test
    void convertLine0(){
        line = "rsbs r0, r0, #0";
        Rsb rsb = new Rsb(line);

        String res = rsb.convert();

        Assertions.assertEquals("0100001001000000", res);
    }

    @Test
    void convertLine1(){
        line = "rsbs r4, r4, #0";
        Rsb rsb = new Rsb(line);

        String res = rsb.convert();

        Assertions.assertEquals("0100001001100100", res);
    }
}