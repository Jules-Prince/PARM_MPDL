package Instructions;

public class Sub extends Instruction {
    String opCode;
    String rm;
    String rn;
    String rd;

    public Sub(String line) {
        String[] args = line.split(" ");
        opCode = args[0];
        rm = args[1];
        rn = args[2];
        rd = args[3];
    }

    @Override
    public String convert(){
        StringBuilder bin = new StringBuilder();
        bin.append("0001101");

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
