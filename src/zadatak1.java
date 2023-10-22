import java.sql.SQLOutput;
import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        /* 1. Olimpijske medalje
        Korisnik unosi imena 3 drzava koje su se takmicile na olimpijskim igrama
        u Tokiju 2021. Nakon toga unosi redom po 3 cela broja za svaku (ukupno 9 brojeva)
        koje redom oznacavaju broj osvojenih zlatnih medalja,
                broj osvojenih srebrnih medalja, broj osvojenih bronzanih medalja.
                Na standardni izlaz ispisati ime pobednicke drzave. Pobednicka drzava je ona
        koja ima vise zlatnih medalja u odnosu na ostale dve. Ukoliko neke 2 drzave
        imaju isti broj osvojenih zlatnih medalja, onda je pobedila ona koja ima najvise
        srebrnih medalja. Ukoliko dve drzave takodje imaju isti broj osvojenih
        srebrnih medalja, onda se gledaju bronzane, a ukoliko imaju isti broj svih medalja
        ispisati poruku "Nereseno".
                ------------------------------------------------------------------------------------
        Primer 1:
        Input:
        "Engleska" "Srbija" "Nemacka"
        3 4 1
        5 1 1
        2 2 2
        Output:
        "Srbija"

        Primer 2:
        Input:
        "Japan" "USA" "Francuska"
        1 2 3
        1 2 1
        0 0 0
        Output:
        "Japan"

        Primer 3:
        Input:
        "Belgija" "Italija" "Egipat"
        1 2 3
        1 2 3
        1 2 2
        Output:
        "Nereseno"
    */

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite imena drzava.");
        String drzavaJedan = sc.nextLine();
        String drzavaDva = sc.nextLine();
        String drzavaTri = sc.nextLine();

        System.out.println("Unesite medalje za: " + drzavaJedan);
        int zlatneMedalje1 = sc.nextInt();
        int srebrneMedalje1 = sc.nextInt();
        int bronzaneMedalje1 = sc.nextInt();

        System.out.println("Unesite medalje za: " + drzavaDva);
        int zlatneMedalje2 = sc.nextInt();
        int srebrneMedalje2 = sc.nextInt();
        int bronzaneMedalje2 = sc.nextInt();

        System.out.println("Unesite medalje za: " + drzavaTri);
        int zlatneMedalje3 = sc.nextInt();
        int srebrneMedalje3 = sc.nextInt();
        int bronzaneMedalje3 = sc.nextInt();

        if (zlatneMedalje1 > zlatneMedalje2 && zlatneMedalje1 > zlatneMedalje3)
            System.out.println(drzavaJedan);
        else if(zlatneMedalje2 > zlatneMedalje1 && zlatneMedalje2 > zlatneMedalje3)
            System.out.println(drzavaDva);
        else if (zlatneMedalje3 > zlatneMedalje1 && zlatneMedalje3 > zlatneMedalje2)
            System.out.println(drzavaTri);
        else if (srebrneMedalje1 > srebrneMedalje2 && srebrneMedalje1 > srebrneMedalje3)
            System.out.println(drzavaJedan);
        else if(srebrneMedalje2 > srebrneMedalje1 && srebrneMedalje2 > srebrneMedalje3)
            System.out.println(drzavaDva);
        else if (srebrneMedalje3 > srebrneMedalje1 && srebrneMedalje3 > srebrneMedalje2)
            System.out.println(drzavaTri);
        else if (bronzaneMedalje1 > bronzaneMedalje2 && bronzaneMedalje1 > bronzaneMedalje3)
            System.out.println(drzavaJedan);
        else if(bronzaneMedalje2 > bronzaneMedalje1 && bronzaneMedalje2 > bronzaneMedalje3)
            System.out.println(drzavaDva);
        else if (bronzaneMedalje3 > bronzaneMedalje1 && bronzaneMedalje3 > bronzaneMedalje2)
            System.out.println(drzavaTri);
        else
            System.out.println("Nereseno");
    }
}
