package Instructions;

//cmn rn rm
public class Cmn extends Instruction{
    String opCode;
    String rn;
    String rm;

    public Cmn(String line){
        String[] args = line.split(" ");
        opCode = args[0];
        rn = args[1];
        rm = args[2];
    }

    @Override
    public String convert() {
        StringBuilder bin = new StringBuilder();
        bin.append("00100");
        return bin.toString();
    }
}
