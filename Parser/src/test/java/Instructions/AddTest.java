package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {
    String line;

    @Test
    void convertLine0(){
        line = "adds r0, r0, r0";
        Add add = new Add(line);

        String res = add.convert();

        Assertions.assertEquals("0001100000000000", res);
    }

    @Test
    void convertLine1(){
        line = "adds r7, r6, r1";
        Add add = new Add(line);

        String res = add.convert();

        Assertions.assertEquals("0001100001110111", res);
    }
}