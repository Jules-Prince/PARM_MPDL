package Instructions;

public class Lsl extends Instruction{
    String opCode;
    String imm;
    String rm;
    String rd;

    public Lsl(String line) {
        String[] args = line.split(" ");
        opCode = args[0];
        rd = args[1];
        rm = args[2];
        if(args.length == 4)
            imm = args[3];
    }

    @Override
    public String convert(){
        StringBuilder bin = new StringBuilder();

        if(imm != null){
            bin.append("00000");

            int nbImm = Integer.parseInt(String.valueOf(imm.charAt(1)));
            String nbImmBin = Integer.toBinaryString(nbImm);
            if(nbImmBin.length()<5){
                for(int i=0; i<5-nbImmBin.length(); i++)
                    bin.append("0");
            }
            bin.append(nbImmBin);
        }
        else{
            bin.append("0100000010");
        }

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
