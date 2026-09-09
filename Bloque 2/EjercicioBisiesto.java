import java.util.Scanner;

public class EjercicioBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Introduce un año (entero positivo): ");
        int año = scanner.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }

        System.out.print("Introduce un número del 1 al 7: ");
        int numeroDia = scanner.nextInt();

        switch (numeroDia) {
            case 1:
                System.out.println("Día: lunes");
                break;
            case 2:
                System.out.println("Día: martes");
                break;
            case 3:
                System.out.println("Día: miércoles");
                break;
            case 4:
                System.out.println("Día: jueves");
                break;
            case 5:
                System.out.println("Día: viernes");
                break;
            case 6:
                System.out.println("Día: sábado");
                break;
            case 7:
                System.out.println("Día: domingo");
                break;
            default:
                System.out.println("Error: El " + numeroDia + " está fuera del rango de los 7 dias de la semana.");
                break;
        }

        scanner.close();
    }
}
