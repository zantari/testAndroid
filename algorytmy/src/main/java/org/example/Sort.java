package org.example;

import java.util.Random;
import java.util.Scanner;

public class Sort {
    private int rozmiar;
    private int [] elementy;

    public Sort(int rozmiar, int[] elementy) {
        this.rozmiar = rozmiar;
        this.elementy = elementy;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < elementy.length; i++) {
            System.out.println("podaj "+(i+1)+" liczbe: ");
            int nowyElement = sc.nextInt();
            this.elementy[i] = nowyElement;

        }
    }

    public Sort(int rozmiar){
        this.rozmiar = rozmiar;
        this.elementy = new int[rozmiar];
        Random random = new Random();


        for (int i = 0; i < elementy.length; i++) {
            int randomLiczba = random.nextInt(100)+1;
            this.elementy[i] = randomLiczba;

        }
    }

    public void getElementy() {
        for (int i = 0; i < elementy.length; i++) {
            System.out.println("element " + (i+1) +": " + elementy[i]);

        }
    }

    public int najwiekszaLiczba(){
        int max = elementy[0];

        for (int i = 0; i < elementy.length; i++) {
            if(max<elementy[i]){
                max = elementy[i];
            }

        }
        return max;
    }

    public int najmniejszaLiczba(){
        int min = elementy[0];
        for (int i = 0; i < elementy.length; i++) {
            if(min>elementy[i]){
                min = elementy[i];
            }
        }
        return min;
    }







    public int drugaNajwieksza(){
        int second = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < elementy.length; i++) {
            if(max < elementy[i]){
                second = max;
                max = elementy[i];
            }

        }
        if(rozmiar<4){
            return max;
        }



        return second;
    }








    public int drugaNajmniejsza(){
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < elementy.length; i++) {
            if(min>elementy[i]){
                second = min;
                min = elementy[i];
            }
            else if(elementy[i]<second && elementy[i] != min){
                second = elementy[i];
            }

        }
        return second;
    }
}
