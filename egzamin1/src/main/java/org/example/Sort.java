package org.example;

import java.util.Scanner;

public class Sort {
    private final int[]tablica = new int[10];

    public Sort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj elementy tablicy: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("element "+(i+1)+": ");
            tablica[i] = sc.nextInt();
        }


    }

    public void sortowanie(){

        for (int i = 0; i < tablica.length; i++) {
            int max = i;
            for (int j = i+1; j < tablica.length; j++) {
                if (tablica[j]>tablica[max]){
                    max=j;

            }

        }
            if(max!=i){
                int pom = tablica[i];
                tablica[i] = tablica[max];
                tablica[max] = pom;

            }


        }

    }

    private int najwyzszaWartosc(){
        int najwyzsza = tablica[0];

        for (int i = 0; i < tablica.length ; i++) {
            if(tablica[i]>najwyzsza){
                najwyzsza = tablica[i];
            }

        }


        return najwyzsza;
    }


    public void zczytywanieTablicy(){
        System.out.println("Elementy posortowanej malejaco tablicy: ");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("element: "+(i+1)+": "+this.tablica[i]);

        }
        System.out.println("Najwieksza liczba z tej tablicy jest: "+najwyzszaWartosc());
    }
}
