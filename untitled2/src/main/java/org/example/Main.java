package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static void main() {




        List<String> transakcje = List.of(
                "Styczeń-150.00",
                "Luty-80.00",
                "Styczeń-50.00",
                "Marzec-120.50",
                "Luty-20.00",
                "Styczeń-200.00"
        );
        Zliczanie zliczanie = new Zliczanie(transakcje);


        Map<String, Double>podsumowanieMiesiecy = zliczanie.podsMiesiecy();

        System.out.println(podsumowanieMiesiecy);


        Map<String, Integer> dodanieMiesiecy = zliczanie.ileMiesiecy();

        System.out.println(dodanieMiesiecy);


        Double calkowiteWydatki = zliczanie.dodanieWydatkow(podsumowanieMiesiecy);

        System.out.println("Calkowicie wydales: "+ calkowiteWydatki +"zl");






















    }
}
