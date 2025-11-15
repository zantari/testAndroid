
void main() {

    Scanner sc = new Scanner(System.in);


    System.out.println("Witaj w rejestracji uzytkownika!!");
    ImieNazwiskoWalidacja imienazwisko;


    do{
        System.out.println("Podaj swoje imie");
        String imie = sc.nextLine();
        System.out.println("Teraz prosze podaj swoje nazwisko");
        String nazwisko = sc.nextLine();
        imienazwisko = new ImieNazwiskoWalidacja(imie, nazwisko);

        if(!imienazwisko.walidacja()){
            System.out.println("Niestety podales nieprawidlowe dane, sprobuj ponownie");
        }

    }
    while(!imienazwisko.walidacja());

    System.out.printf("Super! Teraz proszę ciebie, ");
    EmailWalidacja emailWalidacja;

    do{
        System.out.printf("Podaj swoj adres email\n");
        String email = sc.nextLine();

        emailWalidacja = new EmailWalidacja(email);


        if(!emailWalidacja.walidacja()){
            System.out.println("nieprawidlowy email. Sprobuj ponownie!");
        }

    }
    while(!emailWalidacja.walidacja());


    System.out.printf("Super! Teraz");

    PeselWalidacja peselWalidacja;
    do {
        System.out.printf("podaj swoj pesel \n");
        String pesel = sc.nextLine();
        peselWalidacja = new PeselWalidacja(pesel);
        if(!peselWalidacja.sumaKontrolna()){
            System.out.println("Pesel jest nieprawidlowy sproboj ponownie.");
        }




    }


    while(!peselWalidacja.sumaKontrolna());
    char plec = peselWalidacja.sprawdzeniePlci();

    boolean czyPrawidlowy = peselWalidacja.sumaKontrolna();

    String prawidlowosc = (czyPrawidlowy) ? "prawidlowy" : "nieprawidlowy";

    String plecUzytkownika = (plec == 'K') ? "kobieta" : "mezczyzna";
    System.out.println("Twoj PESEL jest " + prawidlowosc +", jesteś " + plecUzytkownika);




















    //PLAN: ZROBIC CALKOWITA WALIDACJE CZLOWIEKA
    //Czlowiek ma podac kraj zamieszkania, jesli kraju nie ma w dokumencie txt false
    //Czlowiek ma podac swojego mejla, jesli podal bez @ i . false
}
