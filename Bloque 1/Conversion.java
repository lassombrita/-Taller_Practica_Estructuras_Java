import java.util.Scanner;
public class Conversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    System.out.print("ingrese la temperatura en celsius");
    double celsius = sc.nextDouble();

    double fahrenheit = (celsius * 9/5) + 32;
    System.out.printf("la temperatura en fahrenheit es: %.2f",fahrenheit);
    System.out.println("\n");
    double kelvin = celsius + 273.15;
    System.out.printf("la temperatura en kelvin es: %.2f",kelvin);
    sc.close();

    }
}
