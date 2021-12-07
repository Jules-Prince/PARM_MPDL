package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovsTest {
    String line;

    @Test
    void convertLine0(){
        line = "movs r0, #0";
        Movs movs = new Movs(line);

        String res = movs.convert();

        Assertions.assertEquals("0010000000000000", res);
    }

    @Test
    void convertLine1(){
        line = "movs r1, #170";
        Movs movs = new Movs(line);

        String res = movs.convert();

        Assertions.assertEquals("0010000110101010", res);
    }

    @Test
    void convertLine2(){
        line = "movs r2, #255";
        Movs movs = new Movs(line);

        String res = movs.convert();

        Assertions.assertEquals("0010001011111111", res);
    }
}