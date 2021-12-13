package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdcTest {
    String line;

    @Test
    void convertLine0(){
        line = "adcs r0, #0";
        Adc adc = new Adc(line);

        String res = adc.convert();

        Assertions.assertEquals("0100000101000000", res);
    }

    @Test
    void convertLine1(){
        line = "adcs r5 r1";
        Adc adc = new Adc(line);

        String res = adc.convert();

        Assertions.assertEquals("0100000101001101", res);
    }
}