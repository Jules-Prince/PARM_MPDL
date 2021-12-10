import Exceptions.ErrorOnInstruction;
import Exceptions.UnkwnonInstructionException;
import Instructions.*;

public class Parser {
    private String inputFilePath;
    private String outputFilePath;

    private AssemblyFile fileToParse;
    private OutputFile output;

    public Parser(String inputFilePath, String outputFilePath) {
        this.inputFilePath = inputFilePath;
        this.outputFilePath = outputFilePath;
        this.fileToParse = new AssemblyFile(inputFilePath);
        this.output = new OutputFile(outputFilePath);
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

    public void parseFile() {

        for (String line : this.getFileToParse().getLines()) {
            String hexInstruction;
            try {
                hexInstruction = this.readInstructionAndConvertToHex(line);
            } catch (UnkwnonInstructionException | ErrorOnInstruction e) {
                e.printStackTrace();
                continue;
            }
            this.getOutput().addInstruction(hexInstruction);
        }

        System.out.println(this.getOutput().getOutput().toString());
        this.getOutput().write();
    }

    private String readInstructionAndConvertToHex(String line) throws UnkwnonInstructionException, ErrorOnInstruction {
        Instruction instructions = detectInstruction(line);
        if (instructions == null) {
            throw new UnkwnonInstructionException(line.split(" ")[0] + " est une instruction inconnue");
        }
        String binInstruction = instructions.convert();
        return instructions.convertBinToHexa(binInstruction);
    }


    public Instruction detectInstruction(String line) throws ErrorOnInstruction {
        String[] args = line.split(" ");
        String opCode = args[0];
        try {
            return switch (opCode) {
                case "adc" -> new Adc(line);
                case "adds" -> new Add(line);
                case "addi" -> new Addi(line);
                case "ands" -> new And(line);
                case "asrs" -> new Asr(line);
                case "bic" -> new Bic(line);
                case "cmn" -> new Cmn(line);
                case "cmp" -> new Cmp(line);
                case "eors" -> new Eor(line);
                case "lsls" -> new Lsl(line);
                case "lsrs" -> new Lsr(line);
                case "movs" -> new Movs(line);
                case "mul" -> new Mul(line);
                case "mvn" -> new Mvn(line);
                case "orr" -> new Orr(line);
                case "ror" -> new Ror(line);
                case "rsb" -> new Rsb(line);
                case "sbc" -> new Sbc(line);
                case "subs" -> new Sub(line);
                case "subi" -> new Subi(line);
                case "tst" -> new Tst(line);
                default -> null;
            };
        } catch (Exception e) {
            throw new ErrorOnInstruction(opCode + " a donné l'erreur : " + e.getMessage());
        }
    }

}
