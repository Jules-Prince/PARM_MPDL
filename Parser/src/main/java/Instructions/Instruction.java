package Instructions;

public abstract class Instruction {

    private StringBuilder bin;

    public Instruction() {
        this.bin = new StringBuilder();
    }

    public abstract String convert();

    public String convertBinToHexa(String bin) {
        StringBuilder hexa = new StringBuilder();
        double dec = 0;
        String[] ind = bin.split("");

        for (int i = 0; i < ind.length; i++) {
            int nb = Integer.parseInt(ind[ind.length - 1 - i]);
            dec = dec + (nb * Math.pow(2, i));
        }

        if (Integer.toHexString((int) dec).length() != 4) {
            hexa.append("0".repeat(Math.max(0, 4 - Integer.toHexString((int) dec).length())));
        }

        hexa.append(Integer.toHexString((int) dec));
        return hexa.toString();

    }

    public StringBuilder getBin() {
        return bin;
    }

    public void setBin(StringBuilder bin) {
        this.bin = bin;
    }

    String convertToBinary3Bits(int nb) {
        return this.convertToBinaryNBits(nb, 3);
    }

    String convertToBinary4Bits(int nb) {
        return this.convertToBinaryNBits(nb, 4);
    }

    String convertToBinary8Bits(int nb) {
        return this.convertToBinaryNBits(nb, 8);
    }

    String convertToBinaryNBits(int nb, int nBits) {
        StringBuilder bin = new StringBuilder();
        String nbBin = Integer.toBinaryString(nb);
        if (nbBin.length() < nBits) {
            bin.append("0".repeat(nBits - nbBin.length()));
        } else if (nbBin.length() > nBits) {
            nbBin = nbBin.substring(nbBin.length() - nBits);
        }
        bin.append(nbBin);


        return bin.toString();
    }

    /*String convertImm3ToBin(String imm3){

    }*/


}
