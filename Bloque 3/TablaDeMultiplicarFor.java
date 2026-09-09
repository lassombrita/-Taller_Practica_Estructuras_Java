import java.util.Scanner;

public class TablaDeMultiplicarFor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int n = sc.nextInt();
        
        System.out.println("Tabla de multiplicar del " + n + ":");
        
        for (int j = 1; j <= 10; j++) {
            int resultado = n * j;
            
            System.out.print(n + " x " + j + " = ");
            
            if (resultado < 10) {
                System.out.println("  " + resultado);
            } else if (resultado < 100) {
                System.out.println(" " + resultado);
            } else {
                System.out.println(resultado);
            }
        }
     
        sc.close();
    }
}
