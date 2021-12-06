package Instructions;

public class Add extends Instruction {
    String opCode;
    String registre;
    String imm;

    public Add(String line) {
        String[] args = line.split(" ");
        opCode = args[0];
        registre = args[1];
        imm = args[2];
    }

    @Override
    public void convert(){
        String bin = "00100";

        int nbRegistre = Integer.parseInt(registre.substring(0));
        String nbRegistreBin = Integer.toBinaryString(nbRegistre);
        bin += nbRegistreBin;

        int nbImm = Integer.parseInt(imm.substring(0));
        String nbImmBin = Integer.toBinaryString(nbImm);
        bin += nbImmBin;
    }
}
