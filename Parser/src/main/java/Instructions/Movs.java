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
        if(nbRegistreBin.length()<3){
            for(int i=0; i<3-nbRegistreBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbRegistreBin);

        int nbImm = Integer.parseInt(imm.substring(1));
        String nbImmBin = Integer.toBinaryString(nbImm);
        if(nbImmBin.length()<8){
            for(int i=0; i<8-nbRegistreBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbImmBin);

        return bin.toString();
    }
}
