package Instructions;

public class Rsb extends Instruction {
    String opCode;
    String rd;
    String rn;
    String imm;

    public Rsb(String line){
        String[] args = line.split(" ");
        opCode = args[0];
        rd = args[1];
        rn = args[2];
        imm = args[3];
    }

    @Override
    public String convert() {
        StringBuilder bin = new StringBuilder();
        bin.append("0100001001");

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
