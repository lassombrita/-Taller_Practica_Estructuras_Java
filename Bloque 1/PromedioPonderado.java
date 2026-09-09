import java.util.Scanner;
public class PromedioPonderado {

    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);

    
    System.out.print("Ingrese la nota 1: ");
    double nota1 = sc.nextDouble();

    System.out.print("ingrese la nota 2: ");
    double nota2 = sc.nextDouble();

    System.out.print("ingrese la nota 3 :");
    double nota3 = sc.nextDouble();

    double definitiva = (nota1 * 0.30) + (nota2* 0.30) + (nota3* 0.40);

    System.out.printf("%.2f",definitiva);
    System.out.println("\n");
    
    String estado = (definitiva >= 3.0) ? "Aprobado" : "Reprobado";

    System.out.println("el estado de su nota es: " + estado);

    sc.close();
    
    }

}
