import java.util.Scanner;

public class TarifaParqueadero {
    public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(System.in);

        int tipoVehiculo;
        int horas;
        int totalPagar = 0;
        boolean opcionValida = true;

        System.out.print("Ingrese el tipo de vehículo (1=Moto, 2=Carro, 3=Camioneta): ");
        tipoVehiculo = sc.nextInt();

        System.out.print("Ingrese el número de horas de permanencia: ");
        horas = sc.nextInt();

        if (horas <= 0) {
            System.out.println("El número de horas debe ser mayor a 0.");
            sc.close();
            return;
        }

        switch (tipoVehiculo) {
            case 1: // Moto
                totalPagar = 2000 + (horas - 1) * 1500;
                break;

            case 2: // Carro
                totalPagar = 4000 + (horas - 1) * 3000;
                break;

            case 3: // Camioneta
                totalPagar = 5000 + (horas - 1) * 4000;
                break;

            default:
                opcionValida = false;
                System.out.println("La opción no es válida.");
                break;}

        if (opcionValida) {
            System.out.println("El valor total a pagar es: $" + totalPagar);
        }

        sc.close();
    }
}
