import java.util.Scanner;

public class zadatak6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godine");
        int godine = sc.nextInt();
        System.out.println("Unesite visinu");
        double visina = sc.nextDouble();
        System.out.println("Unesite min visinu");
        double minVisina = sc.nextDouble();

        if( godine > 16 || visina >= minVisina)
            System.out.println("Dobrososli.");
        else
            System.out.println("Ne mozete uci.");
    }
}
