import java.util.Scanner;

public class Imc {
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

        System.out.println("Calcularemos nuestro índice de masa corporal (IMC)");    
        System.out.print("Ingrese su peso en Kg: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese su estatura en cm: ");
        int estatura = sc.nextInt();

        double imc = peso / Math.pow(estatura, 2);

        if (imc <= 18.5){
            System.out.println("Bajo peso");
        }
        else if (imc >18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        }
        else if (imc >24.9 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }
        else
            {System.out.println("Sobrepeso");
        }
sc.close();
    }
}