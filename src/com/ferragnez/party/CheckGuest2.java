package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest2 {

    public static void main(String[] args) {

        String listaInvitati[] = {
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il nome dell'invitato");
        String guestName = scan.nextLine();
        

        int i = 0;
        boolean isNameFound = false;
        while (!isNameFound && i < listaInvitati.length) {
            if (listaInvitati[i].equalsIgnoreCase(guestName)) {
                isNameFound = true;
            } else {
                i++;
            }
        }

        if (isNameFound) {
            System.out.println("Prego l'invitato è presente nella lista può entrare!");
        } else {
            System.out.println("L'invitato non è presente nella lista è pregato di tornare da dove è venuto grazie!");
        }

        scan.close();

    }

}
