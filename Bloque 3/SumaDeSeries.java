import java.util.Scanner;

public class SumaSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        
        int suma1 = 0;

        for (int i = 1; i <= n; i++) {
            suma1 = suma1 + i;
        }

        System.out.println("Suma de naturales: " + suma1);


        int suma2 = 0;

        for (int i = 1; i <= n; i++) {
            suma2 = suma2 + (2 * i);
        }

        System.out.println("Suma de pares: " + suma2);


        int suma3 = 0;

        for (int i = 1; i <= n; i++) {
            suma3 = suma3 + (i * i);
        }

        System.out.println("Suma de cuadrados: " + suma3);
    sc.close();
    }
}
