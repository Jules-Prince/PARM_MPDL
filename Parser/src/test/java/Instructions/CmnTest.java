package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CmnTest {
    String line;

    @Test
    void convertLine0(){
        line = "cmns r0, r0";
        Cmn cmn = new Cmn(line);

        String res = cmn.convert();

        Assertions.assertEquals("0100001011000000", res);
    }

    @Test
    void convertLine1(){
        line = "cmns r3, r1";
        Cmn cmn = new Cmn(line);

        String res = cmn.convert();

        Assertions.assertEquals("0100001011001011", res);
    }
}