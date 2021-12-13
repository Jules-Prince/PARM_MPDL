package Instructions;

public class Mvn extends Instruction {
    String opCode;
    String rd;
    String rm;

    public Mvn(String line){
        String[] args = line.split(" ");
        opCode = args[0];
        rd = args[1];
        rm = args[2];
    }

    @Override
    public String convert() {
        StringBuilder bin = new StringBuilder();
        bin.append("0100001111");

        int nbRm = Integer.parseInt(String.valueOf(rm.charAt(1)));
        String nbRmBin = Integer.toBinaryString(nbRm);
        if(nbRmBin.length()<3){
            for(int i=0; i<3-nbRmBin.length(); i++)
                bin.append("0");
        }
        bin.append(nbRmBin);

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
