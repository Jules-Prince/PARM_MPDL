package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTest {
    String line;

    @Test
    void convertB(){
        line = "b .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11100.jsp1";
        Assertions.assertEquals(res, bin);
    }

    @Test
    void convertEQ(){
        line = "bEQ .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11010000.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertNE(){
        line = "bNE .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11010001.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertCSetHS(){
        line = "bCS .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11010010.jsp1";
        Assertions.assertEquals(res, bin);
        line = "bHS .jsp1";
        bin = b.convert();
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertCCetLO(){
        line = "bCC .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11010011.jsp1";
        Assertions.assertEquals(res, bin);
        line = "bLO .jsp1";
        bin = b.convert();
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertMI(){
        line = "bMI .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11010100.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertPL(){
        line = "bPL .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11010101.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertVS(){
        line = "bVS .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11010110.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertVC(){
        line = "bVC .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11010111.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertHI(){
        line = "bHI .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11011000.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertLS(){
        line = "bLS .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11011001.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertGE(){
        line = "bGE .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11011010.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertLT(){
        line = "bLT .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11011011.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertGT(){
        line = "bGT .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11011100.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertLE(){
        line = "bLE .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11011101.jsp1";
        Assertions.assertEquals(res, bin);
    }
    @Test
    void convertAL(){
        line = "bAL .jsp1";
        B b = new B(line);
        String bin = b.convert();
        String res = "11011110.jsp1";
        Assertions.assertEquals(res, bin);
    }
}