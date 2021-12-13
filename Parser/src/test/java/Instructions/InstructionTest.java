package Instructions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructionTest {

    @Test
    void convertBinToHexaDF(){
        String bin = "11011111";
        Instruction instruction = new Instruction() {
            @Override
            public String convert() {
                return "11011111";
            }
        };
        String hexa = instruction.convertBinToHexa(bin);
        String res = ("00df");
        Assertions.assertEquals(res, hexa);
    }

}