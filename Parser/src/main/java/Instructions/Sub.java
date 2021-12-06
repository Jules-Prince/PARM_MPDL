package Instructions;

public class Sub extends Instruction {
    String opCode;
    String registre;
    String imm;

    public Sub(String line) {
        String[] args = line.split(" ");
        opCode = args[0];
        registre = args[1];
        imm = args[2];
    }

    @Override
    public String convert(){
        String bin = "00100";

        int nbRegistre = Integer.parseInt(registre.substring(0));
        String nbRegistreBin = Integer.toBinaryString(nbRegistre);
        bin += nbRegistreBin;

        int nbImm = Integer.parseInt(imm.substring(0));
        String nbImmBin = Integer.toBinaryString(nbImm);
        bin += nbImmBin;

        return bin;
    }
}
