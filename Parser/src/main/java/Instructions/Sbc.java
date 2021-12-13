package Instructions;

public class Sbc extends Instruction {
    String opCode;
    String rdn;
    String rm;

    public Sbc(String line){
        String[] args = line.split(" ");
        opCode = args[0];
        rdn = args[1];
        rm = args[2];
    }

    @Override
    public String convert() {
        StringBuilder bin = new StringBuilder();
        bin.append("0100000110");

        int nbRm = Integer.parseInt(String.valueOf(rm.charAt(1)));
        String nbRmBin = Integer.toBinaryString(nbRm);
        if(nbRmBin.length()<3){
            for(int i=0; i<3-nbRmBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbRmBin);

        int nbRdn = Integer.parseInt(String.valueOf(rdn.charAt(1)));
        String nbRdnBin = Integer.toBinaryString(nbRdn);
        if(nbRdnBin.length()<3){
            for(int i=0; i<3-nbRdnBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbRdnBin);

        return bin.toString();
    }
}
