import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        HashMap<String, String> diccionary = new HashMap<>();

        diccionary.put("rojo", "red");
        diccionary.put("azul", "blue");
        diccionary.put("verde", "green");
        diccionary.put("amarillo", "yellow");
        diccionary.put("blanco", "white");
        diccionary.put("negro", "black");
        diccionary.put("flor", "flower");
        diccionary.put("árbol", "tree");
        diccionary.put("cielo", "sky");
        diccionary.put("mar", "sea");
        diccionary.put("playa", "beach");
        diccionary.put("montaña", "mountain");
        diccionary.put("ciudad", "city");
        diccionary.put("pueblo", "village");
        diccionary.put("puerta", "door");
        diccionary.put("ventana", "window");
        diccionary.put("silla", "chair");
        diccionary.put("mesa", "table");
        diccionary.put("pájaro", "bird");
        diccionary.put("pez", "fish");

        Scanner scan = new Scanner(System.in);
        String palabra;

        do {
            System.out.println("Para terminar el programa escriba 'salir'");
            System.out.println();
            System.out.println("Ingrese la palabra a buscar");
            palabra = scan.nextLine();

            if (diccionary.containsKey(palabra)){

                System.out.println("Su version en ingles es: " + diccionary.get(palabra));
            } else {

                System.out.println("Disculpa, no me se esa traducion");
            }
        } while(!palabra.equals("salir"));
    }
}
