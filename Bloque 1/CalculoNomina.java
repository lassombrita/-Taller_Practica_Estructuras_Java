import java.util.Scanner;
public class CalculoNomina {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba su nombre varon: ");
        String nombre = sc.nextLine();

        System.out.print("digita la hora: ");
        double hora = sc.nextDouble();

        System.out.print("digite el valorHora");
        double valorHora = sc.nextDouble();
        double salarioBruto = hora * valorHora;
        System.out.println("el salarioBruto: " + salarioBruto);
        double descuentoSS  = salarioBruto * 0.08;
        System.out.println("el descuentoSS es: " + descuentoSS);
        double retencion    = salarioBruto * 0.05;
        System.out.println("la retencion es: " + retencion);
        double salarioNeto  = salarioBruto - descuentoSS - retencion;
        
        System.out.println("el salario Neto es: " + salarioNeto);
        sc.close();
    }
}