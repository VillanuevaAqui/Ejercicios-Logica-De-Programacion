import java.util.Scanner;

public class ejercicio8 {

    // Función para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si el número es divisible por algún valor entre 2 y la raíz cuadrada de num, no es primo
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        // Leer los 10 números desde la consola
        System.out.println("Por favor ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            nums[i] = scanner.nextInt();
        }

        // Crear dos arrays para almacenar primos y no primos
        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int indicePrimos = 0;
        int indiceNoPrimos = 0;

        // Separar los números primos de los no primos
        for (int num : nums) {
            if (esPrimo(num)) {
                primos[indicePrimos++] = num;
            } else {
                noPrimos[indiceNoPrimos++] = num;
            }
        }

        // Crear el array resultante con primos al principio y no primos al final
        int[] resultado = new int[10];
        int indiceResultado = 0;

        // Colocar los primos en el inicio
        for (int i = 0; i < indicePrimos; i++) {
            resultado[indiceResultado++] = primos[i];
        }

        // Colocar los no primos al final
        for (int i = 0; i < indiceNoPrimos; i++) {
            resultado[indiceResultado++] = noPrimos[i];
        }

        // Mostrar el array final con las posiciones e índices
        System.out.println("\nArray ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.println("pos[" + i + "] = " + resultado[i]);
        }

        scanner.close();
    }
}


