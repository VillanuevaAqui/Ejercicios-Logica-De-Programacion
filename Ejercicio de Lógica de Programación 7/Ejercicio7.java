import java.util.Scanner;

public class Ejercicio7 {

    // Método para verificar si el día es válido
    public static boolean esDiaValido(String dia) {
        return dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") ||
                dia.equalsIgnoreCase("miércoles") || dia.equalsIgnoreCase("jueves") ||
                dia.equalsIgnoreCase("viernes");
    }

    // Método para verificar si la hora es válida
    public static boolean esHoraValida(int hora, int minutos) {
        return hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dia;
        int hora, minutos;

        // Solicitar el día hasta que sea válido
        while (true) {
            System.out.print("Ingresa el día de la semana (lunes, martes, miércoles, jueves, viernes): ");
            dia = scanner.nextLine().trim().toLowerCase();
            if (esDiaValido(dia)) {
                break;  // El día es válido, salimos del ciclo
            } else {
                System.out.println("Día inválido. Por favor ingresa un día entre Lunes y Viernes.");
            }
        }

        // Solicitar la hora y minutos hasta que sean válidos
        while (true) {
            System.out.print("Ingresa la hora (0-23): ");
            hora = scanner.nextInt();
            System.out.print("Ingresa los minutos (0-59): ");
            minutos = scanner.nextInt();

            if (esHoraValida(hora, minutos)) {
                break;  // Hora y minutos válidos, salimos del ciclo
            } else {
                System.out.println("Hora o minutos inválidos. Por favor ingresa una hora válida (0-23) y minutos válidos (0-59).");
            }
        }

        // Calcular los minutos desde el inicio de la semana (Lunes 00:00)
        int minutosLunes = 0;  // Lunes 00:00 es el inicio de la semana, por lo que tiene 0 minutos
        int minutosPorDia = 1440;  // 24 horas * 60 minutos = 1440 minutos por día

        // Mapeo de los días de la semana a sus minutos desde el Lunes 00:00
        int minutosDesdeLunes = 0;
        switch (dia) {
            case "lunes":
                minutosDesdeLunes = minutosLunes;
                break;
            case "martes":
                minutosDesdeLunes = minutosLunes + minutosPorDia;
                break;
            case "miércoles":
                minutosDesdeLunes = minutosLunes + 2 * minutosPorDia;
                break;
            case "jueves":
                minutosDesdeLunes = minutosLunes + 3 * minutosPorDia;
                break;
            case "viernes":
                minutosDesdeLunes = minutosLunes + 4 * minutosPorDia;
                break;
        }

        // Sumar las horas y minutos del día ingresado
        minutosDesdeLunes += hora * 60 + minutos;

        // El viernes a las 15:00 (3 PM) son 5 días y 15 horas = 15 * 60 = 750 minutos después del lunes 00:00
        int minutosFinDeSemana = 5 * minutosPorDia + 15 * 60;

        // Calcular los minutos faltantes
        int minutosFaltantes = minutosFinDeSemana - minutosDesdeLunes;

        // Mostrar el resultado
        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");

        scanner.close();
    }
}
