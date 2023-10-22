import java.util.Scanner;

public class zadatak8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite brojeve");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>=0 && y>=0 )
            System.out.println("Oba broja pozitivna.");
        else if ( x <0 && y<0)
            System.out.println("Oba broja negativna.");
        else
            System.out.println("Jedan pozitivan, drugi negativan.");
    }
}
