package Instructions;

public class Addi extends Instruction{
    String opCode;
    String imm;
    String rn;
    String rd;

    public Addi(String line) {
        String[] args = line.split(" ");
        opCode = args[0];
        rd = args[1];
        rn = args[2];
        imm = args[3];
    }

    @Override
    public String convert(){
        StringBuilder bin = new StringBuilder();
        bin.append("0001110");

        int nbImm = Integer.parseInt(String.valueOf(imm.charAt(1)));
        String nbImmBin = Integer.toBinaryString(nbImm);
        if(nbImmBin.length()<3){
            for(int i=0; i<3-nbImmBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbImmBin);

        int nbRn = Integer.parseInt(String.valueOf(rn.charAt(1)));
        String nbRnBin = Integer.toBinaryString(nbRn);
        if(nbRnBin.length()<3){
            for(int i=0; i<3-nbRnBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbRnBin);

        int nbRd = Integer.parseInt(String.valueOf(rd.charAt(1)));
        String nbRdBin = Integer.toBinaryString(nbRd);
        if(nbRdBin.length()<3){
            for(int i=0; i<3-nbRdBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbRdBin);

        return bin.toString();
    }
}
