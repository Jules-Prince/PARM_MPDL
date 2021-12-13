package Instructions;

public class B {
    String line;
    String cond;
    String imm;
    String b;

    B(String line){
        this.line = line;
        String[] args = line.split(" ");
        b =args[0];
        if(b.length() > 1){
            cond = b.substring(1);
        }
        imm = args[1];
    }

    String convert(){
        StringBuilder bin = new StringBuilder();

        if(b.length() == 1){
            bin.append("11100");
        }

        if(b.length() > 1){
            StringBuilder condBin = new StringBuilder();
            switch(cond){
                case "EQ":
                    condBin.append("0000");
                    break;
                case "NE":
                    condBin.append("0001");
                    break;
                case "CS":
                    condBin.append("0010");
                    break;
                case "HS":
                    condBin.append("0010");
                    break;
                case "CC":
                    condBin.append("0011");
                    break;
                case "LO":
                    condBin.append("0011");
                    break;
                case "MI":
                    condBin.append("0100");
                    break;
                case "PL":
                    condBin.append("0101");
                    break;
                case "VS":
                    condBin.append("0110");
                    break;
                case "VC":
                    condBin.append("0111");
                    break;
                case "HI":
                    condBin.append("1000");
                    break;
                case "LS":
                    condBin.append("1001");
                    break;
                case "GE":
                    condBin.append("1010");
                    break;
                case "LT":
                    condBin.append("1011");
                    break;
                case "GT":
                    condBin.append("1100");
                    break;
                case "LE":
                    condBin.append("1101");
                    break;
                case "AL":
                    condBin.append("1110");
                    break;

            }

            bin.append("1101");
            bin.append(condBin.toString());
        }

        bin.append(imm); /**convertir l'argument en bits*/

        return bin.toString();
    }
}
