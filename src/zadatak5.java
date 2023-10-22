import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj.");
        int x = sc.nextInt();
        boolean znakJePromenjen = false;
        if (x < 0){
            x=x*(-1);
            znakJePromenjen = true;
        }
        System.out.println("Apsolutna vrednost je: " + x);
        if (znakJePromenjen)
            System.out.println("Promenjen je znak.");
    }
}
