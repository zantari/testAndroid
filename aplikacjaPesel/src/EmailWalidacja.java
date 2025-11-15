public class EmailWalidacja {
    private String email;

    public EmailWalidacja(String email) {
        this.email = email;
    }

    public Boolean walidacja(){


        if(email.length()<4){
            return false;
        }else{
            String znakiEmailowe = "@.";
            int pomocnicza = 0;
            for (int i = 0; i < znakiEmailowe.length(); i++) {
                String znakEmailowy = String.valueOf(znakiEmailowe.charAt(i));
                if(email.contains(znakEmailowy)){
                    pomocnicza++;
                }

            }
            return pomocnicza == 2;

        }

    }
}
