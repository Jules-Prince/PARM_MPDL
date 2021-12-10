
public class Main {
    public static void main(String[] args) {
        //String input = args[0];
        //String output = args[1];

        String input  = "FirstInstruction.s";
        String output = "Output.bin";

        Parser parser = new Parser(input, output);
        parser.parseFile();
    }
}
