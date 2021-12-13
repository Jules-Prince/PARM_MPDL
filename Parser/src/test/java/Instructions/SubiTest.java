package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubiTest {
    String line;

    @Test
    void convertLine0(){
        line = "subs r0, r0, #0";
        Subi subi = new Subi(line);

        String res = subi.convert();

        Assertions.assertEquals("0001111000000000", res);
    }

    @Test
    void convertLine1(){
        line = "subs r6, r0, #5";
        Subi subi = new Subi(line);

        String res = subi.convert();

        Assertions.assertEquals("0001111101000110", res);
    }
}