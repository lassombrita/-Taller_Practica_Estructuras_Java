import java.util.Scanner;

public class ValidacionEdad {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.println("Ingrese su edad:");
        edad = sc.nextInt();

        while (edad < 1 || edad > 120) {

            System.out.println("Edad no válida.");
            System.out.println("La edad debe estar entre 1 y 120.");

            System.out.println("Ingrese nuevamente su edad:");
            edad = sc.nextInt();
        }

        if (edad <= 12) {
            System.out.println("Niñez");
        }
        else if (edad <= 17) {
            System.out.println("Adolescencia");
        }
        else if (edad <= 25) {
            System.out.println("Juventud");
        }
        else if (edad <= 59) {
            System.out.println("Adultez");
        }
        else {
            System.out.println("Tercera edad");
        }

        sc.close();
    }
}