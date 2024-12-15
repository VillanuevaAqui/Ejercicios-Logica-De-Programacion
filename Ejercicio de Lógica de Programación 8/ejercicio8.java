import java.util.Scanner;

public class ejercicio8 {

    // Función para verificar si un número es primo, retorna un boolean
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        } else {
         
            for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        }
        
        return true;
    }

    //flujo Principal del programa
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Por favor ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] primos = new int[10];
        int[] noPrimos = new int[10];
        int indicePrimos = 0;
        int indiceNoPrimos = 0;

        // Separar los números primos de los no primos
        for (int num : nums) {
            if (esPrimo(num)) {
                primos[indicePrimos] = num;
                indicePrimos++;
            } else {
                noPrimos[indiceNoPrimos] = num;
                indiceNoPrimos++;
            }
        }

        int[] resultado = new int[10];
        int indiceResultado = 0;

        for (int i = 0; i < indicePrimos; i++) {
            resultado[indiceResultado] = primos[i];
            indiceResultado++;
        }

        for (int i = 0; i < indiceNoPrimos; i++) {
            resultado[indiceResultado] = noPrimos[i];
            indiceResultado++;
        }

        System.out.println("\nArray ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.println("pos[" + i + "] = " + resultado[i]);
        }

        scanner.close();
    }
}


