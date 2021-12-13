package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MulTest {
    String line;

    @Test
    void convertLine0(){
        line = "muls r0, #0";
        Mul mul = new Mul(line);

        String res = mul.convert();

        Assertions.assertEquals("0100001101000000", res);
    }

    @Test
    void convertLine1(){
        line = "muls r5, r2";
        Mul mul = new Mul(line);

        String res = mul.convert();

        Assertions.assertEquals("0100001101010101", res);
    }
}