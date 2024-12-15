import java.util.Scanner;

public class Ejercicio7 {

    // Metodo para verificar si el día es válido
    public static boolean esDiaValido(String dia) {
        return dia.equalsIgnoreCase("lunes") || dia.equalsIgnoreCase("martes") ||
                dia.equalsIgnoreCase("miércoles") || dia.equalsIgnoreCase("jueves") ||
                dia.equalsIgnoreCase("viernes");
    }

    // Metodo para verificar si la hora es válida
    public static boolean esHoraValida(int hora, int minutos) {
        return hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60;
    }

    //Flujo general del programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dia;
        int hora, minutos;

        while (true) {
            System.out.print("Ingresa el día de la semana (lunes, martes, miércoles, jueves, viernes): ");
            dia = scanner.nextLine().trim().toLowerCase();
            if (esDiaValido(dia)) {
                break;
            } else {
                System.out.println("Día inválido. Por favor ingresa un día entre Lunes y Viernes.");
            }
        }

        while (true) {
            System.out.print("Ingresa la hora (0-23): ");
            hora = scanner.nextInt();
            System.out.print("Ingresa los minutos (0-59): ");
            minutos = scanner.nextInt();

            if (esHoraValida(hora, minutos)) {
                break;
            } else {
                System.out.println("Hora o minutos inválidos. Por favor ingresa una hora válida (0-23) y minutos válidos (0-59).");
            }
        }

        int minutosPorDia = 1440;  // 24 horas * 60 minutos = 1440 minutos por día
        int minutosDesdeLunes = 0;

        switch (dia) {
            case "lunes":
                minutosDesdeLunes = minutosPorDia;
                break;
            case "martes":
                minutosDesdeLunes = 2 * minutosPorDia;
                break;
            case "miércoles":
                minutosDesdeLunes = 3 * minutosPorDia;
                break;
            case "jueves":
                minutosDesdeLunes = 4 * minutosPorDia;
                break;
            case "viernes":
                minutosDesdeLunes = 5 * minutosPorDia;
                break;
        }

        // Sumar las horas y minutos del día ingresado
        minutosDesdeLunes += hora * 60 + minutos;

        // definimos los minutos desde el lunes hasta el viernes a las 15hrs
        int minutosFinDeSemana = 5 * minutosPorDia + 15 * 60;

        int minutosFaltantes = minutosFinDeSemana - minutosDesdeLunes;

        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");

        scanner.close();
    }
}
