package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddiTest {
    String line;

    @Test
    void convertLine0(){
        line = "adds r0, r0, #0";
        Addi addi = new Addi(line);

        String res = addi.convert();

        Assertions.assertEquals("0001110000000000", res);
    }

    @Test
    void convertLine1(){
        line = "adds r5, r2, #5";
        Addi addi = new Addi(line);

        String res = addi.convert();

        Assertions.assertEquals("0001110101010101", res);
    }
}