package Instructions;

public abstract class Instruction {

    public abstract String convert();

    String convertBinToHexa(String bin){
        String hexa;
        double dec=0;
        String[] ind = bin.split("");

        for(int i=0; i<ind.length; i++){
            int nb = Integer.parseInt(ind[ind.length - 1 - i]);
            dec = dec + (nb * Math.pow(2, i));
        }
        hexa = Integer.toHexString((int)dec);
        return hexa;

    }
}
