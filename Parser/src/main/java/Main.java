
public class Main {
    public static void main(String[] args) {
        String input = args[0];
        String output = args[1];

        Parser parser = new Parser(input, output);
        parser.parseFile();
    }
}
