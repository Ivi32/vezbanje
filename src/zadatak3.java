import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Koliko imate novcica?");
        int x = sc.nextInt();
        switch(x){
            case 3:
                System.out.println("Mozete kupiti konja.");
            case 2:
                System.out.println("Mozete kupiti stit.");
            case 1:
                System.out.println("Mozete kupiti mac.");
                break;
        }
    }
}
