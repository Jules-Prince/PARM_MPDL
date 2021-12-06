package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovsTest {
    String opCode;
    String registre;
    String imm;

    String line;

    @Test
    void convertLine0(){
        line = "movs r0, #0";
        Movs movs = new Movs(line);

        String res = movs.convert();

        Assertions.assertEquals("0010000000000000", res);
    }


}