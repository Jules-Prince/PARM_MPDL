import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AssemblyFile {

    private File file;
    private static int nbLines = 1;
    private Map<String, Integer> lines;

    public AssemblyFile(String inputFile) {
        this.file = new File(System.getProperty("user.dir") + "/src/main/resources/" + inputFile);
        this.lines = new HashMap<>();
        this.init();
    }

    public Map<String, Integer> getLines() {
        return lines;
    }

    public void setLines(Map<String, Integer> lines) {
        this.lines = lines;
    }

    public void init() {
        Scanner sc = null;
        List<String> tmpLines = new ArrayList<>();
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            assert sc != null;
            if (!sc.hasNextLine()) break;
            tmpLines.add(sc.nextLine());
        }
        int nbLines = 0;
        for (String tmpLine : tmpLines) {
            if(!tmpLine.startsWith(".")){
                nbLines++;
            }
            if (tmpLine.equals("") || tmpLine.contains("@") || (tmpLine.startsWith(".") && !tmpLine.endsWith(":"))) {
                continue;
            }
            tmpLine = tmpLine.replace("\t", "");
            tmpLine = tmpLine.replace(":", "");
            this.getLines().put(tmpLine, nbLines);

        }

        this.setLines(this.sortByValue());
    }

    public HashMap<String, Integer> sortByValue() {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list = new LinkedList<>(this.getLines().entrySet());

        // Sort the list using lambda expression
        list.sort((i1, i2) -> i1.getValue().compareTo(i2.getValue()));

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    @Override
    public String toString() {
        return "AssemblyFile{" +
                "lines=" + lines +
                '}';
    }
}
