import java.util.Scanner;

public class zadatak7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite cenu artikla.");
        double cena = sc.nextDouble();
        System.out.println("Unesite stanje racuna.");
        double stanjeRacuna = sc.nextDouble();
        if (cena <= stanjeRacuna){
            System.out.println("Kupili ste artikal.");
            stanjeRacuna -= cena;
        }
        else
            System.out.println("Ne mozete kupiti.");
        System.out.println("Stanje racuna: " + stanjeRacuna);
    }
}
