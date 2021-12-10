package Instructions;

//adds
public class Add extends Instruction {
    String opCode;
    String rm;
    String rn;
    String rd;

    public Add(String line) {
        String[] args = line.split(" ");
        opCode = args[0];
        rd = args[1];
        rn = args[2];
        rm = args[3];
    }

    @Override
    public String convert(){
        StringBuilder bin = new StringBuilder();
        bin.append("0001100");

        int nbRm = Integer.parseInt(String.valueOf(rm.charAt(1)));
        String nbRmBin = Integer.toBinaryString(nbRm);
        if(nbRmBin.length()<3){
            bin.append("0".repeat(3 - nbRmBin.length()));
        }
        bin.append(nbRmBin);

        int nbRn = Integer.parseInt(String.valueOf(rn.charAt(1)));
        String nbRnBin = Integer.toBinaryString(nbRn);
        if(nbRnBin.length()<3){
            bin.append("0".repeat(3 - nbRnBin.length()));
        }
        bin.append(nbRnBin);

        int nbRd = Integer.parseInt(String.valueOf(rd.charAt(1)));
        String nbRdBin = Integer.toBinaryString(nbRd);
        if(nbRdBin.length()<3){
            bin.append("0".repeat(3 - nbRdBin.length()));
        }
        bin.append(nbRdBin);

        return bin.toString();
    }
}
