import java.util.Scanner;

public class ValidacionDeEntradaConWhile {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();

        while (edad < 1 || edad > 120) {

            System.out.println("Error: la edad debe estar entre 1 y 120.");

            System.out.print("Ingrese nuevamente su edad: ");
            edad = entrada.nextInt();
        }

        if (edad <= 12) {
            System.out.println("Etapa: Niñez");
        }
        else if (edad <= 17) {
            System.out.println("Etapa: Adolescencia");
        }
        else if (edad <= 25) {
            System.out.println("Etapa: Juventud");
        }
        else if (edad <= 59) {
            System.out.println("Etapa: Adultez");
        }
        else {
            System.out.println("Etapa: Tercera edad");
        }

        entrada.close();
    }
}