package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    static void main() {
        String tekst = "jakisTekst";
        String nazwaPliku = "dokument.txt";

        try{
            FileWriter fileWriter = new FileWriter(nazwaPliku, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(tekst);
            printWriter.close();
            System.out.println("zapisano");
            System.out.println(System.getProperty("user.dir"));

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }
}
