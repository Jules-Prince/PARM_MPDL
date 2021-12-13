package Instructions;

public class Mul extends Instruction {
    String opCode;
    String rdm;
    String rn;

    public Mul(String line){
        String[] args = line.split(" ");
        opCode = args[0];
        rdm = args[1];
        rn = args[2];
    }

    @Override
    public String convert() {
        StringBuilder bin = new StringBuilder();
        bin.append("0100001101");

        int nbRn = Integer.parseInt(String.valueOf(rn.charAt(1)));
        String nbRnBin = Integer.toBinaryString(nbRn);
        if(nbRnBin.length()<3){
            for(int i=0; i<3-nbRnBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbRnBin);

        int nbRdm = Integer.parseInt(String.valueOf(rdm.charAt(1)));
        String nbRdmBin = Integer.toBinaryString(nbRdm);
        if(nbRdmBin.length()<3){
            for(int i=0; i<3-nbRdmBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbRdmBin);

        return bin.toString();
    }
}
