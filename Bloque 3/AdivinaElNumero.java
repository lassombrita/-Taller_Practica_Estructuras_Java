import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        int numeroUsuario = 0;
        
        System.out.println("Adivina el número (entre 1 y 100):");
        
        while (numeroUsuario != numeroSecreto) {
            intentos++;
            System.out.print("Intento " + intentos + ": ");
            numeroUsuario = sc.nextInt();
            
            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! Lo lograste en " + intentos + " intentos.");
            }
        }
        
        sc.close();
    }
}
