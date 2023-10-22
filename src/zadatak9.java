import java.util.Scanner;

public class zadatak9 {
    public static void main(String[] args) {
        System.out.println("Unesite karakter.");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c){
            case '+', '-':
                System.out.println("+/-");
                break;
            case '*', '/':
                System.out.println("*/");
        }
    }
}
