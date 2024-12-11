import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        String word = scan.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {

            System.out.print(word.charAt(i));
        }
    }
}
