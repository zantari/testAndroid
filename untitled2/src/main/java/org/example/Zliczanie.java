package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zliczanie {
    private final List<String> transakcje;
    public Zliczanie(List<String> transakcje) {
        this.transakcje = transakcje;

    }

    public Map<String, Double> podsMiesiecy(){

        Map<String, Double> podsumowanieMiesiecy = new HashMap<>();



        for(String transakcja : transakcje){
            String czesci [] = transakcja.split("-");
            String miesiac = czesci[0];
            Double kwota = Double.parseDouble(czesci[1]);

            Double aktualnaSuma = podsumowanieMiesiecy.getOrDefault(miesiac, 0.00);
            podsumowanieMiesiecy.put(miesiac, aktualnaSuma+kwota);
        }

        return podsumowanieMiesiecy;
    }




    public Double dodanieWydatkow(Map<String, Double>podsumowanieMiesiecy){
        Double suma = 0.00;

        for(Double wydatek : podsumowanieMiesiecy.values()){
            suma+=wydatek;
        }

        return suma;
    }


    public Map<String, Integer> ileMiesiecy(){
        Map<String,Integer> zliczanieMiesiecy = new HashMap<>();

        for(String transakcja:transakcje){
            String czesci [] = transakcja.split("-");
            String miesiac = czesci[0];

            Integer ileMiesiecy = zliczanieMiesiecy.getOrDefault(miesiac, 0);

            zliczanieMiesiecy.put(miesiac, ileMiesiecy+1);


        }
        return zliczanieMiesiecy;
    }










}
