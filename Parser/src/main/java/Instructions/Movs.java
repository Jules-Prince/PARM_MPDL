package Instructions;

public class Movs extends Instruction{
    String opCode;
    String registre;
    String imm;

    public Movs(String line) {
        String[] args = line.split(" ");
        opCode = args[0];
        registre = args[1];
        imm = args[2];
    }

    @Override
    public String convert(){
        StringBuilder bin = new StringBuilder();
        bin.append("00100");

        int nbRegistre = Integer.parseInt(String.valueOf(registre.charAt(1)));
        String nbRegistreBin = Integer.toBinaryString(nbRegistre);
        bin.append(nbRegistreBin);
        if(nbRegistreBin.equals("0")){
            bin.append("00");
        }

        int nbImm = Integer.parseInt(imm.substring(1));
        String nbImmBin = Integer.toBinaryString(nbImm);
        bin.append(nbImmBin);
        if(nbImmBin.equals("0")){
            bin.append("0000000");
        }

        return bin.toString();
    }
}
