package org.example;


import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        Sort sort;
        Random random = new Random();

        System.out.println("Witaj podaj rozmiar tablicy: ");
        Scanner sc = new Scanner(System.in);
        int rozmiar;
        if(sc.hasNextInt()) {
             rozmiar = sc.nextInt();
            sc.nextLine();

        }
        else{
            System.out.println("nieprawidlowy rozmiar, losowanie...");
             rozmiar = random.nextInt(20)+1;
            System.out.println("Wylosowano "+rozmiar+" elementow tablicy");
        }

        sc = new Scanner(System.in);

        System.out.println("chcesz podac elementy tablicy? [t]");

        String wybor = sc.nextLine();
        if(wybor.equalsIgnoreCase("t")) {
            System.out.println("Teraz podaj elementy tablicy");
            int[] elementy = new int[rozmiar];

             sort = new Sort(rozmiar, elementy);
        }else{
            System.out.println("Losowanie elementow tablicy...");
            sort = new Sort(rozmiar);

        }




        int najwiekszaLiczba = sort.najwiekszaLiczba();
        int najmniejszaLiczba = sort.najmniejszaLiczba();
        System.out.println("Najwieksza liczba wynosi: " + najwiekszaLiczba + ", a najmniejsza "+najmniejszaLiczba + " najwieksza jest wieksza od najmniejszej o "+(najwiekszaLiczba-najmniejszaLiczba) +"!!");
        System.out.println("Druga najwieksza liczba wynosi: "+ sort.drugaNajwieksza() + ", a druga najmniejsza: " + sort.drugaNajmniejsza());
        System.out.println("Czy chcialbys zobaczyc cala tablice? [t/n]");
        String tn = sc.next();
        while(true) {


            if (tn.equals("t")) {
                sort.getElementy();
                break;
            } else if (tn.equals("n")) {
                break;

            } else {
                System.out.println("wpisz t - aby zobaczyc elementy tablicy, lub n - jezeli nie chcesz");

                tn = sc.next();
            }
        }








    }
}
