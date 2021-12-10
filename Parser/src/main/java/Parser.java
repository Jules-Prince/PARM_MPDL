import Exceptions.UnkwnonInstructionException;
import Instructions.*;

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

    public void parseFile(){
        for(String line : this.getFileToParse().getLines()){
            Instruction instructions = detectInstruction(line);
            if(instructions==null){
                new UnkwnonInstructionException(line.split(" ")[0] + " n'est pas une instruction reconnue").toString();
                continue;
            }
            String binInstruction = instructions.convert();
            this.getOutput().addInstruction(instructions.convertBinToHexa(binInstruction));
        }
        System.out.println(this.getOutput().getOutput().toString());
        this.getOutput().write();
    }


    public Instruction detectInstruction(String line){
        String[] args = line.split(" ");
        String opCode = args[0];
        return switch (opCode) {
            case "adc"  -> new Adc(line);
            case "adds"  -> new Add(line);
            case "addi" -> new Addi(line);
            case "and"  -> new And(line);
            case "asrs"  -> new Asr(line);
            case "bic"  -> new Bic(line);
            case "cmn"  -> new Cmn(line);
            case "cmp"  -> new Cmp(line);
            case "eor"  -> new Eor(line);
            case "lsls"  -> new Lsl(line);
            case "lsr"  -> new Lsr(line);
            case "movs" -> new Movs(line);
            case "mul"  -> new Mul(line);
            case "mvn"  -> new Mvn(line);
            case "orr"  -> new Orr(line);
            case "ror"  -> new Ror(line);
            case "rsb"  -> new Rsb(line);
            case "sbc"  -> new Sbc(line);
            case "subs"  -> new Sub(line);
            case "subi" -> new Subi(line);
            case "tst"  -> new Tst(line);
            default -> null;
        };
    }

}
