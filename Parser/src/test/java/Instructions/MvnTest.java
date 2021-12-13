package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MvnTest {
    String line;

    @Test
    void convertLine0(){
        line = "mvns r0, #0";
        Mvn mvn = new Mvn(line);

        String res = mvn.convert();

        Assertions.assertEquals("0100001111000000", res);
    }

    @Test
    void convertLine1(){
        line = "mvns r7, r2";
        Mvn mvn = new Mvn(line);

        String res = mvn.convert();

        Assertions.assertEquals("0100001111010111", res);
    }
}