package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CmpTest {
    String line;

    @Test
    void convertLine0(){
        line = "cmp r0, #0";
        Cmp cmp = new Cmp(line);

        String res = cmp.convert();

        Assertions.assertEquals("0010100000000000", res);
    }

    @Test
    void convertLine1(){
        line = "cmp r1, #170";
        Cmp cmp = new Cmp(line);

        String res = cmp.convert();

        Assertions.assertEquals("0010100110101010", res);
    }
}