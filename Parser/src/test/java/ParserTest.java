import org.junit.jupiter.api.Test;

public class ParserTest {

    String inputFile;
    String outputFile;

    @Test
    void parseFile(){
        inputFile = "FirstInstruction.s";
        outputFile = "Output.bin";

        Parser parser = new Parser(inputFile, outputFile);
        parser.parseFile();


    }
}
