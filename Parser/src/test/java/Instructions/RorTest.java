package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RorTest {
    String line;

    @Test
    void convertLine0(){
        line = "rors r0, #0";
        Ror ror = new Ror(line);

        String res = ror.convert();

        Assertions.assertEquals("0100000111000000", res);
    }

    @Test
    void convertLine1(){
        line = "rors r6, r1";
        Ror ror = new Ror(line);

        String res = ror.convert();

        Assertions.assertEquals("0100000111001110", res);
    }
}