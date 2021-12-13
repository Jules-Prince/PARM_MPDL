package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AsrTest {
    String line;

    @Test
    void convertLine0(){
        line = "asrs, r0, r0, #0";
        Asr asr = new Asr(line);

        String res = asr.convert();

        Assertions.assertEquals("0001000000000000", res);
    }

    @Test
    void convertLine1(){
        line = "asrs, r6, r6, #1";
        Asr asr = new Asr(line);

        String res = asr.convert();

        Assertions.assertEquals("0001000001110110", res);
    }
}