import javax.print.attribute.IntegerSyntax;

public class PeselWalidacja {
    private int[] peselTab = new int[11];
    private int[] wagiCyfr = new int[]{1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

    public PeselWalidacja(String pesel) {

        if(pesel.isEmpty()){
            pesel = "85072491101";
        }
        if(pesel.length() != 11){
            pesel = "85072491101";
        }

        for (int i = 0; i < 11; i++) {
            this.peselTab[i] = Character.getNumericValue(pesel.charAt(i));
        }


    }

    public char sprawdzeniePlci(){
        if(peselTab[9] %2 ==0){
            return 'K';
        }else{
            return 'M';
        }
    }




    public Boolean sumaKontrolna(){
        int S = 0;
        for (int i = 0; i < wagiCyfr.length; i++) {
             S += peselTab[i] * wagiCyfr[i];
        }
        int M = S%10;

        int R =0;
        if(M!=0){
            R=10-M;
        }

        if(R==peselTab[10]){
            return true;
        }
        else{
            return false;
        }
    }
}
