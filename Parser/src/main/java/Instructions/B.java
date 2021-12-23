package Instructions;


public class B extends Instruction{
    String line;
    String cond;
    String imm;
    String b;

    public B(String line){
        this.line = line;
        String[] args = line.split(" ");
        b =args[0];
        if(b.length() > 1){
            cond = b.substring(1);
        }
        imm = args[1];
    }

    public String convert(){
        StringBuilder bin = new StringBuilder();

        if(b.length() == 1){
            bin.append("11100");
        }

        if(b.length() > 1){
            StringBuilder condBin = new StringBuilder();
            switch (cond) {
                case "EQ" -> condBin.append("0000");
                case "NE" -> condBin.append("0001");
                case "CS", "HS" -> condBin.append("0010");
                case "CC", "LO" -> condBin.append("0011");
                case "MI" -> condBin.append("0100");
                case "PL" -> condBin.append("0101");
                case "VS" -> condBin.append("0110");
                case "VC" -> condBin.append("0111");
                case "HI" -> condBin.append("1000");
                case "LS" -> condBin.append("1001");
                case "GE" -> condBin.append("1010");
                case "LT" -> condBin.append("1011");
                case "GT" -> condBin.append("1100");
                case "LE" -> condBin.append("1101");
                case "AL" -> condBin.append("1110");
            }

            bin.append("1101");
            bin.append(condBin);
        }
        bin.append(imm); /**convertir l'argument en bits*/

        return bin.toString();
    }
}
