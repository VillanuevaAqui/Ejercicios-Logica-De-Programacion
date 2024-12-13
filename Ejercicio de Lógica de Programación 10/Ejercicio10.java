import java.util.*;

public class Ejercicio10 {

    //Método para crear y devolver el diccionario
    public static HashMap<String, String> crearDiccionario() {
        HashMap<String, String> diccionario = new HashMap<>();

        // Añadir al diccionario 20 palabras con sus respectivas traducciones
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
        Collections.shuffle(palabrasEspañol);  // Mezcla aleatoriamente las palabras
        return palabrasEspañol.subList(0, 5);  // Devuelve las primeras 5 palabras aleatorias
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el diccionario
        HashMap<String, String> diccionario = crearDiccionario();

        // Seleccionar 5 palabras aleatorias
        List<String> palabrasSeleccionadas = seleccionarPalabrasAleatorias(diccionario);

        int correctas = 0;
        int incorrectas = 0;

        // Pedir al usuario las traducciones
        for (String palabraEspañol : palabrasSeleccionadas) {
            System.out.print("¿Cuál es la traducción de '" + palabraEspañol + "' al inglés? ");
            String traduccionUsuario = scanner.nextLine().toLowerCase().trim();  // Aseguramos que la respuesta sea en minúsculas y sin espacios adicionales

            // Verificar si la traducción es correcta
            if (diccionario.get(palabraEspañol).equals(traduccionUsuario)) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabraEspañol));
                incorrectas++;
            }
        }

        // Mostrar el resultado final
        System.out.println("\nResultado final:");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        scanner.close();
    }
}
