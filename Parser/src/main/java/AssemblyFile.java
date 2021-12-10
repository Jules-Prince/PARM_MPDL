import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AssemblyFile {

    private File file;
    private List<String> lines;

    public AssemblyFile(String inputFile) {
        this.file = new File(System.getProperty("user.dir") + "/src/main/resources/" + inputFile);
        this.lines = new ArrayList<>();
        this.init();
    }

    public File getFile() {
        return file;
    }

    public List<String> getLines() {
        return lines;
    }

    public void init() {
        Scanner sc = null;
        List<String> tmpLines = new ArrayList<>();
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()) {
            tmpLines.add(sc.nextLine());
        }

        for(String tmpLine : tmpLines) {
            if(tmpLine.equals("") || tmpLine.contains("@")){
                continue;
            }
            this.getLines().add(tmpLine);
        }
    }

    @Override
    public String toString() {
        return "AssemblyFile{" +
                "lines=" + lines +
                '}';
    }
}
