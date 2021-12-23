package Instructions;

public class Sub extends Instruction {
    String opCode;
    String rm;
    String rn;
    String rd;
    String imm3;
    String imm8;

    public Sub(String line) {
        String[] args = line.split(" ");
        opCode = args[0];
        rd = args[1];

        if(args.length < 4){
            imm8 = args[2];
        } else {
            rn = args[2];
            if(args[3].contains("r"))
                rm = args[3];
            else
                imm3 = args[3];
        }

    }

    @Override
    public String convert(){

        if(rm == null && imm3 != null){ //subs r4, r3, #1
            this.getBin().append("0001111");

            int nbImm = Integer.parseInt(imm3.substring(1));
            this.getBin().append(this.convertToBinary3Bits(nbImm));
        } else if (rm == null){ //subs r4, "124
            this.getBin().append("00111");

            int nbRd = Integer.parseInt(String.valueOf(rd.charAt(1)));
            this.getBin().append(this.convertToBinaryNBits(nbRd, 3));

            int nbImm8 = Integer.parseInt(imm8.substring(1));
            this.getBin().append(this.convertToBinary8Bits(nbImm8));

            return this.getBin().toString();
        } else { //subs r4, r1, r3
            this.getBin().append("0001101");

            int nbRm = Integer.parseInt(String.valueOf(rm.charAt(1)));
            this.getBin().append(this.convertToBinary3Bits(nbRm));
        }

        int nbRn = Integer.parseInt(String.valueOf(rn.charAt(1)));
        this.getBin().append(this.convertToBinary3Bits(nbRn));

        int nbRd = Integer.parseInt(String.valueOf(rd.charAt(1)));
        this.getBin().append(this.convertToBinary3Bits(nbRd));

        return this.getBin().toString();
    }

    

}
