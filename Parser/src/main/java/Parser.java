import java.io.File;
import java.util.List;

public class Parser {
    private String inputFilePath;
    private String outputFilePath;

    private AssemblyFile fileToParse;
    private OutputFile output;

    public Parser(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        this.fileToParse = new AssemblyFile(inputFilePath);
    }

    public String getInputFilePath() {
        return inputFilePath;
    }

    public String getOutputFilePath() {
        return outputFilePath;
    }

    public AssemblyFile getFileToParse() {
        return fileToParse;
    }

    public OutputFile getOutput() {
        return output;
    }

    public void parseFile(){

    }
}
