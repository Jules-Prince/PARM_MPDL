package Instructions;

public class Tst extends Instruction {
    String opCode;
    String rn;
    String rm;

    public Tst(String line){
        String[] args = line.split(" ");
        opCode = args[0];
        rn = args[1];
        rm = args[2];
    }

    @Override
    public String convert() {
        StringBuilder bin = new StringBuilder();
        bin.append("0100001000");

        int nbRm = Integer.parseInt(String.valueOf(rm.charAt(1)));
        String nbRmBin = Integer.toBinaryString(nbRm);
        if(nbRmBin.length()<3){
            for(int i=0; i<3-nbRmBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbRmBin);

        int nbRn = Integer.parseInt(String.valueOf(rn.charAt(1)));
        String nbRnBin = Integer.toBinaryString(nbRn);
        if(nbRnBin.length()<3){
            for(int i=0; i<3-nbRnBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbRnBin);

        return bin.toString();
    }
}
