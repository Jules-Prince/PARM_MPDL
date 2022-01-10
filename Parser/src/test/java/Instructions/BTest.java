package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BTest {
    String line;
    B b;

    @BeforeEach
    public void setUp(){
        Map<String, Integer> map = new HashMap<>();
        map.put("then1", 5);
        b = new B("b then1", 5, map);
    }

    @Test
    void convertB(){
        line = "b then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1110011111111110";
        Assertions.assertEquals(res, bin);
    }

    @Test
    void convertEQ(){
        line = "bEQ then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101000011111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertNE(){
        line = "bNE then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101000111111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertCS(){
        line = "bCS then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101001011111110";
        Assertions.assertEquals(res, bin);
    }

    @Test
    void convertHS(){
        line = "bHS then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101001011111110";
        Assertions.assertEquals(res, bin);
    }

    @Test
    void convertCC(){
        line = "bCC then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101001111111110";
        Assertions.assertEquals(res, bin);

    }

    @Test
    void convertLO(){
        line = "bLO then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101001111111110";
        Assertions.assertEquals(res, bin);
    }

    @Test
    void convertMI(){
        line = "bMI then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101010011111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertPL(){
        line = "bPL then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101010111111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertVS(){
        line = "bVS then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101011011111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertVC(){
        line = "bVC then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101011111111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertHI(){
        line = "bHI then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101100011111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertLS(){
        line = "bLS then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101100111111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertGE(){
        line = "bGE then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101101011111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertLT(){
        line = "bLT then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101101111111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertGT(){
        line = "bGT then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101110011111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertLE(){
        line = "bLE then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101110111111110";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertAL(){
        line = "bAL then1";
        b.setLine(line);
        String bin = b.convert();
        String res = "1101111011111110";
        Assertions.assertEquals(res, bin);
    }
}