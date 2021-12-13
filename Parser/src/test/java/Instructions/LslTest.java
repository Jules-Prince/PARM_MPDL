package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LslTest {
    String line;

    @Test
    void convertLine0(){
        line = "lsls r0, r0, #0";
        Lsl lsl = new Lsl(line);

        String res = lsl.convert();

        Assertions.assertEquals("0000000000000000", res);
    }

    @Test
    void convertLine1(){
        line = "lsls r4, r2, #1";
        Lsl lsl = new Lsl(line);

        String res = lsl.convert();

        Assertions.assertEquals("0000000001010100", res);
    }
}