import java.util.*;

public class Ejercicio10 {

    //Método para crear y devolver el diccionario (20 entradas)
    public static HashMap<String, String> crearDiccionario() {
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("ventana", "window");
        diccionario.put("cielo", "sky");
        diccionario.put("agua", "water");
        diccionario.put("comida", "food");
        diccionario.put("familia", "family");
        diccionario.put("ciudad", "city");
        diccionario.put("país", "country");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("día", "day");
        diccionario.put("noche", "night");
        diccionario.put("feliz", "happy");
        diccionario.put("triste", "sad");

        return diccionario;
    }

    // Método para seleccionar 5 palabras aleatorias del diccionario
    public static List<String> seleccionarPalabrasAleatorias(HashMap<String, String> diccionario) {
        List<String> palabrasEspañol = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabrasEspañol); //mezclar una lista dada utilizando la fuente de aleatoriedad predefinida.
        return palabrasEspañol.subList(0, 5); 
    }

    // Flujo principal del programa 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> diccionario = crearDiccionario();

        List<String> palabrasSeleccionadas = seleccionarPalabrasAleatorias(diccionario);

        int correctas = 0;
        int incorrectas = 0;

        for (String palabraEspañol : palabrasSeleccionadas) {
            System.out.print("Cuál es la traducción de '" + palabraEspañol + "' al inglés? ");
            String traduccionUsuario = scanner.nextLine().toLowerCase().trim(); 

            if (diccionario.get(palabraEspañol).equals(traduccionUsuario)) {
                System.out.println("Es correcto, felicidades ");
                correctas++;
            } else {
                System.out.println("Fallaste, la tradución era: " + diccionario.get(palabraEspañol));
                incorrectas++;
            }
        }

        System.out.println("\nResultado final:");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}
