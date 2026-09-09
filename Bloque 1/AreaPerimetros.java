import java.util.Scanner;

public class AreaPerimetros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese la Base");
        int base = sc.nextInt();

        System.out.print("ingrese la Altura");
        int altura = sc.nextInt();

        System.out.print("ingrese el radio del circulo");
        double radio = sc.nextDouble();

        int areaRectangulo = base * altura;
        int perimetroRectangulo = 2 * (base + altura);
        double areaCirculo = Math.PI * radio * radio;
        double circunferencia = 2 * Math.PI * radio;

        System.out.println("El area del Rectangulo es: " + areaRectangulo);
        System.out.println("El area del circulo es: " + areaCirculo);
        System.out.println("El perimetro del Rectangulo es: " + perimetroRectangulo);
        System.out.println("la circunferencia es: " + circunferencia);
    }

}
