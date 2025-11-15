public class ImieNazwiskoWalidacja {
    private String imie;
    private String nazwisko;


    public ImieNazwiskoWalidacja(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Boolean walidacja(){
        if (imie.isEmpty() || nazwisko.isEmpty() ||imie.length()<3 || nazwisko.length()<3 || imie.length()>30 || nazwisko.length()>30 ) {
            return false;
        }else{
            String niedozwoloneZnaki = "@#$%^&*()1234567890-=+;'`~][{}:'.,/|/*+!@#$%^&*()";

            for (int i = 0; i < niedozwoloneZnaki.length(); i++) {
                String niedozwolonyZnak = String.valueOf(niedozwoloneZnaki.charAt(i));
                if(imie.contains(niedozwolonyZnak) || nazwisko.contains(niedozwolonyZnak)){
                    return false;
                }
            }
            return true;
        }
    }


}
