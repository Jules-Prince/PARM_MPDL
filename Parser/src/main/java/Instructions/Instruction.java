package Instructions;

public abstract class Instruction {

    public abstract String convert();

    public String convertBinToHexa(String bin){
        StringBuilder hexa = new StringBuilder();
        double dec=0;
        String[] ind = bin.split("");

        for(int i=0; i<ind.length; i++){
            int nb = Integer.parseInt(ind[ind.length - 1 - i]);
            dec = dec + (nb * Math.pow(2, i));
        }

        if(Integer.toHexString((int)dec).length() != 4){
            for(int i=0; i<4-Integer.toHexString((int)dec).length(); i++){
                hexa.append("0");
            }
        }

        hexa.append(Integer.toHexString((int)dec));
        return hexa.toString();

    }
}
