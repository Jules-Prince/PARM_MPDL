package Instructions;

public class Cmp extends Instruction {
    String opCode;
    String registre;
    String imm;

    public Cmp(String line) {
        String[] args = line.split(" ");
        opCode = args[0];
        registre = args[1];
        imm = args[2];
    }

    @Override
    public String convert(){
        StringBuilder bin = new StringBuilder();


        if(imm.startsWith("r") || imm.startsWith("R")){
            bin.append("0100001010");

            int nbRd = Integer.parseInt(String.valueOf(imm.charAt(1)));
            bin.append(this.convertToBinary3Bits(nbRd));

            int nbRegistre = Integer.parseInt(String.valueOf(registre.charAt(1)));
            bin.append(this.convertToBinary3Bits(nbRegistre));

        } else {
            bin.append("00101");

            int nbRegistre = Integer.parseInt(String.valueOf(registre.charAt(1)));
            String nbRegistreBin = Integer.toBinaryString(nbRegistre);
            if(nbRegistreBin.length()<3){
                for(int i=0; i<3-nbRegistreBin.length(); i++)
                    bin.append("0");
            }
            bin.append(nbRegistreBin);

            int nbImm = Integer.parseInt(imm.substring(1));
            bin.append(this.convertToBinary8Bits(nbImm));
        }


        return bin.toString();
    }
}
