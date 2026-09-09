import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Ingrese a:");
        a = sc.nextInt();

        System.out.println("Ingrese b:");
        b = sc.nextInt();

        int cantidad = 0;
        int suma = 0;

        System.out.println("Números primos:");

        for (int numero = a; numero <= b; numero++) {

            int divisor = 2;
            boolean primo = true;

            while (divisor <= Math.sqrt(numero)) {

                if (numero % divisor == 0) {
                    primo = false;
                }

                divisor++;
            }

            if (primo && numero >= 2) {

                System.out.print(numero + ", ");

                cantidad++;
                suma = suma + numero;
            }
        }

        System.out.println();
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);

        sc.close();
    }
}