import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj.");
        int x = sc.nextInt();
        switch(x){
            case 0, 2, 4, 6, 8:
                System.out.println("Paran broj.");
                break;
            case 1, 3, 5, 7, 9:
                System.out.println("Neparan broj.");
                break;
        }
    }
}
