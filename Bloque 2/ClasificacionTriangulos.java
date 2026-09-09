import java.util.Scanner;

public class ClasificacionTriangulos {
    public static void main(String[] args) throws Exception {
       

        Scanner sc = new Scanner(System.in);

    System.out.println("Vamos a Clasificar triángulos");
        System.out.println("Ingrese el lado a");
        double ladoA = sc.nextInt();
        System.out.println("Ingrese el lado b");
        double ladoB = sc.nextInt();
        System.out.println("Ingrese el lado c");
        double ladoC = sc.nextInt();

        if (ladoA == ladoB && ladoB == ladoC){
            System.out.println("El triangulo es un triangulo Equilátero los tres lados son iguales.");}
            else if ((ladoA == ladoB && ladoA != ladoC) || 
                    (ladoB == ladoC && ladoB != ladoA) || 
                    (ladoA == ladoC && ladoA != ladoB)){
            System.out.println("El triangulo es un triangulo Isósceles exactamente dos lados son iguales.");}
                            else{
            System.out.println("El triangulo es un triangulo Escaleno los tres lados son diferentes.");}
    sc.close();
        }
}
