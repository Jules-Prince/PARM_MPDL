import java.io.FileWriter;
import java.io.IOException;

public class OutputFile {

    private FileWriter file;
    private StringBuilder output;

    public OutputFile(String outputPath) {
        try {
            this.file = new FileWriter(System.getProperty("user.dir") + "/src/main/resources/" + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.output = new StringBuilder();
        this.output.append("v2.0 raw\n");
    }

    public FileWriter getFile() {
        return file;
    }

    public StringBuilder getOutput() {
        return output;
    }

    public boolean write(){
        try {
            this.getFile().write(this.getOutput().toString());
            this.getFile().close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void addInstruction(String instruction){
        this.getOutput().append(instruction);
        this.getOutput().append(" ");
    }


}
