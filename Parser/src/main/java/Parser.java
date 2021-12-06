import java.io.File;

public class Parser {
    private String inputFilePath;
    private String outputFilePath;

    private File fileToParse;

    public Parser(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
    }

    public String getInputFilePath() {
        return inputFilePath;
    }

    public String getOutputFilePath() {
        return outputFilePath;
    }
}
