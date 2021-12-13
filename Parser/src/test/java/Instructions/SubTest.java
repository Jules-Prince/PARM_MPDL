package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubTest {
    String line;

    @Test
    void convertLine0(){
        line = "subs r0, r0, #0";
        Sub sub = new Sub(line);

        String res = sub.convert();

        Assertions.assertEquals("0001101000000000", res); //a changer
    }

    @Test
    void convertLine1(){
        line = "subs r6, r0, #5";
        Sub sub = new Sub(line);

        String res = sub.convert();

        Assertions.assertEquals("0001101101000110", res); //a changer
    }
}